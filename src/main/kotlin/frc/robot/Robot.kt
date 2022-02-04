package frc.robot

import edu.wpi.first.wpilibj.TimedRobot
import edu.wpi.first.wpilibj2.command.Command
import edu.wpi.first.wpilibj2.command.CommandScheduler
import frc.robot.subsystems.*
import java.time.Instant
import java.time.LocalDateTime
import javax.naming.ldap.Control
import kotlin.math.abs

/**
 * The VM is configured to automatically run this class, and to call the functions corresponding to
 * each mode, as described in the TimedRobot documentation. If you change the name of this class or
 * the package after creating this project, you must also update the build.gradle file in the
 * project.
 */
class Robot : TimedRobot() {

    /**
     * This function is run when the robot is first started up and should be used for any
     * initialization code.
     */
    override fun robotInit() {}

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
    override fun autonomousInit() {}

    /**
     * This function is called periodically during autonomous.
     */
    override fun autonomousPeriodic() {}

    /**
     * This function is called once when teleop is enabled.
     */
    override fun teleopInit() {}

    /**
     * This function is called periodically during operator control.
     */
    override fun teleopPeriodic() {

        var log = false
        var printOutString = "[DEBUG] [${LocalDateTime.now()}] "

        if (Controls.isShooting)  {
            val correction = Alignment.calculateHorizontalCorrection()
            correction.first?.let {
                val calculatedCorrection = it.amount * correction.second * 1.4
                Drive.arcadeDrive(0.0, calculatedCorrection)
                printOutString += "[$it correction as $calculatedCorrection] "

                log = true
            }
            Shooter.shoot()
        } else {
            Drive.arcadeDrive(Controls.moveY, Controls.moveX)
        }

         if (log) println(printOutString)
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
