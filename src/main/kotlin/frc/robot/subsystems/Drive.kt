package frc.robot.subsystems

import edu.wpi.first.wpilibj.Spark
import edu.wpi.first.wpilibj.drive.DifferentialDrive
import frc.robot.resources.Constants

object Drive {

    private val leftSpark = Spark(Constants.leftDriveSparkPort)

    private val rightSpark = Spark(Constants.rightDriveSparkPort)

    private val differentialDrive = DifferentialDrive(leftSpark, rightSpark)

    private fun arcadeDrive(pair: Pair<Double, Double>) = arcadeDrive(pair.first, pair.second)

    fun arcadeDrive(throttle: Double, turn: Double) {
        differentialDrive.arcadeDrive(throttle, turn)
    }

    fun tankDrive(leftPower: Double, rightPower: Double) {
        differentialDrive.tankDrive(-rightPower, -leftPower)
    }
    
}
