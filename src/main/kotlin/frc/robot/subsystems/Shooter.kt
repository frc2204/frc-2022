package frc.robot.subsystems

import edu.wpi.first.wpilibj.PWMSparkMax
import frc.robot.resources.Constants

object Shooter {

    val motor = PWMSparkMax(Constants.shooterSparkMax)

    fun detectPower() {

    }

    fun shoot() {
        //motor.set()
    }

    fun stop() {
        motor.set(0.0)
    }


}