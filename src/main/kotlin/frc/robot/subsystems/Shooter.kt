package frc.robot.subsystems

import edu.wpi.first.wpilibj.SlewRateLimiter
import edu.wpi.first.wpilibj.Spark
import edu.wpi.first.wpilibj.VictorSP
import frc.robot.resources.Constants

object Shooter {

    private val motor = Spark(Constants.shooterSparkMaxPort)
    private val intake = VictorSP(Constants.shooterIntakePort)

    private val rateLimiter = SlewRateLimiter(0.35)

    // Shooter Intake
    fun intake() { intake.set(0.5) }
    fun intakeStop() { intake.set(0.0) }

    // Shooter
    fun shoot() { motor.set(rateLimiter.calculate(1.0)) }
    fun eject() { motor.set(rateLimiter.calculate(0.6)) }
    fun stop() { motor.set(rateLimiter.calculate(0.0)) }

}