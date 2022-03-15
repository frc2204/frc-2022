package frc.robot.subsystems

import edu.wpi.first.wpilibj.Spark
import frc.robot.resources.Constants

object Climber {

    private val motor = Spark(Constants.climberSpark)

    fun up() {
        motor.set(-0.8)
    }

    fun down() {
        motor.set(0.8)
    }

    fun stop() {
        motor.set(0.0)
    }

}