package frc.robot.subsystems

import edu.wpi.first.wpilibj.VictorSP
import frc.robot.resources.Constants

object Winch {

    private val motor = VictorSP(Constants.winchVictorSPPort)

    fun up() {
        motor.set(0.4)
    }

    fun down() {
        motor.set(-0.4)
    }

    fun stop() {
        motor.stopMotor()
    }

}