package frc.robot.subsystems

import edu.wpi.first.wpilibj.VictorSP
import frc.robot.resources.Constants

object Intake {

    private val motor = VictorSP(Constants.intakeVictorSPPort)

    fun intake() {
        motor.set(0.5)
    }

    fun reverse() {
        motor.set(-0.5)
    }

    fun stop() {
        motor.stopMotor()
    }

}