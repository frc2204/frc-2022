package frc.robot.subsystems

import edu.wpi.first.wpilibj.DigitalInput
import edu.wpi.first.wpilibj.SlewRateLimiter
import edu.wpi.first.wpilibj.VictorSP
import frc.robot.resources.Constants

object Intake {

    private val motor = VictorSP(Constants.intakeVictorSPPort)

    private val rateLimiter = SlewRateLimiter(0.7)

    fun intake() { motor.set(rateLimiter.calculate(0.7)) }
    fun reverse() { motor.set(rateLimiter.calculate(-0.5)) }
    fun stop() { motor.set(rateLimiter.calculate(0.0)) }

}