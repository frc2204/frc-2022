package frc.robot.subsystems

import edu.wpi.first.wpilibj.PWMSparkMax
import edu.wpi.first.wpilibj.VictorSP
import frc.robot.resources.Constants

object Shooter {

    val motor = PWMSparkMax(Constants.shooterSparkMaxPort)
    private val intake = VictorSP(Constants.shooterIntakePort)

    fun intake() {
        intake.set(0.5)
    }

    fun intakeStop() {
        intake.stopMotor()
    }

    fun shoot() {
        motor.set(-1.0)
    }

    fun eject() {
        motor.set(-0.4)
    }

    fun stop() {
        motor.stopMotor()
    }


}