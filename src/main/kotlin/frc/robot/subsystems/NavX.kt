package frc.robot.subsystems

import com.kauailabs.navx.frc.AHRS
import edu.wpi.first.wpilibj.SPI

val navX = AHRS(SPI.Port.kMXP)

private fun tankTurn(power: Double) {
    Drive.tankDrive(power, -power)
}

fun rightTurn(angle: Double): Boolean {
    when(angle - navX.angle) {
        in -360.0..-0.1 -> tankTurn( -0.62)
        in -0.1..0.1 -> {
            tankTurn(0.0)
            return true
        }
        in 0.1..20.0 -> tankTurn( 0.6)
        else -> tankTurn(0.8)
    }
    return false
}