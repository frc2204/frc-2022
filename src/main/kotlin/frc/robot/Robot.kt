package frc.robot

import edu.wpi.first.wpilibj.Joystick
import edu.wpi.first.wpilibj.TimedRobot
import frc.robot.resources.Constants
import frc.robot.resources.Correction
import frc.robot.subsystems.*

/**
 * The VM is configured to automatically run this class, and to call the functions corresponding to
 * each mode, as described in the TimedRobot documentation. If you change the name of this class or
 * the package after creating this project, you must also update the build.gradle file in the
 * project.
 *
 * Note that [TimedRobot] can be constructed with the default [TimedRobot.kDefaultPeriod], but in this case we use [Constants.robotPeriodUpdate]
 */
class Robot : TimedRobot(Constants.robotPeriodUpdate) {

    /**
     * This function is run when the robot is first started up and should be used for any
     * initialization code.
     */
    override fun robotInit() {
        // Initiate dashboard
        Dashboard.updateDashboard(Correction.nullConnectionPair)
    }

    /**
     * This function is called every robot packet, no matter the mode. Use this for items like
     * diagnostics that you want ran during disabled, autonomous, teleoperated and test.
     *
     * This runs after the mode specific periodic functions, but before
     * LiveWindow and SmartDashboard integrated updating.
     */
    override fun robotPeriodic() {}

    /**
     * This function is called once each time the robot enters Disabled mode.
     */
    override fun disabledInit() {}

    /**
     * This function is called periodically when disabled.
     */
    override fun disabledPeriodic() {}

    /**
     * This function is called once autonomous is enabled.
     */
    override fun autonomousInit() {
        KTimer.startAutomationTimer()
        navX.reset()
        navX.resetDisplacement()
        Autonomous.stepCounter = 0
    }

    /**
     * This function is called periodically during autonomous.
     */
    override fun autonomousPeriodic() {
        Dashboard.updateDashboard(Correction.nullConnectionPair)
        val elapsed = KTimer.elapsed
        Autonomous.midShootPath(elapsed.inMilliseconds)
    }

    /**
     * This function is called once when teleop is enabled.
     */
    override fun teleopInit() {}

    private val joy = Joystick(2)

    /**
     * This function is called periodically during operator control.
     */
    override fun teleopPeriodic() {

        val correction = Alignment.calculateHorizontalCorrection()
        Dashboard.updateDashboard(correction)

        // Drive and Shoot
        if (Controls.isLLAim)  {
            correction.first?.let {
                val calculatedCorrection = it.amount * correction.second // Second determines polarity
                Drive.arcadeDrive(0.0, calculatedCorrection)
            }
        } else {
            Drive.arcadeDrive(Controls.moveY, Controls.moveX)
        }

        if (Controls.isShooting) Shooter.shoot()
        else if (Controls.isShooterEject) Shooter.eject()
        else Shooter.stop()

        if (Controls.isShooterIntaking) Shooter.intake()
        else Shooter.intakeStop()

        if (Controls.isIntaking) {
            Intake.intake()
        } else if(Controls.isReverseIntaking) {
            Intake.reverse()
        } else {
            Intake.stop()
        }

        if (Winch.smartIntake) {
            if (Controls.isIntaking || Controls.isReverseIntaking) Winch.smartIntakeLower()
            else Winch.smartIntakeRaise()
        } else {
            if (Controls.isWinchUp) Winch.up()
            else if (Controls.isWinchDown) Winch.down()
            else Winch.stop()
        }

        Winch.smartButtonScan()

    }
    
    /**
     * This function is called once when test mode is enabled.
     */
    override fun testInit() {}

    /**
     * This function is called periodically during test mode.
     */
    override fun testPeriodic() {}
}
