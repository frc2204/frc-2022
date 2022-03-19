package frc.robot.subsystems

import edu.wpi.first.wpilibj.VictorSP
import frc.robot.resources.Constants

object Winch {

    private val motor = VictorSP(Constants.winchVictorSPPort)
    private const val power = 0.6

    fun up() {
        motor.set(power)
    }

    fun down() {
        motor.set(-power)
    }

    fun stop() {
        motor.set(0.0)
    }

}