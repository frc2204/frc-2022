package frc.robot.subsystems

import com.kauailabs.navx.frc.AHRS
import edu.wpi.first.wpilibj.SPI

val navX = AHRS(SPI.Port.kMXP)

private fun turn(power: Double) {
    Drive.tankDrive(power, -power)
}

fun getAllowedRange(angle: Double) = (angle - 1)..(angle + 1)

fun leftTurn(angle: Double): Boolean {
    val actualAngle = 360 - angle
    return if (actualAngle !in getAllowedRange(actualAngle)) {
        turn(-0.7)
        false
    } else true
}

fun rightTurn(angle: Double): Boolean {
    return if (angle !in getAllowedRange(angle)) {
       turn(0.7)
        false
    } else true
}