package frc.robot.subsystems

import edu.wpi.first.wpilibj.Spark
import edu.wpi.first.wpilibj.drive.DifferentialDrive
import frc.robot.Constants

object Drive {

    private val leftSpark = Spark(Constants.leftSpark)
    private val rightSpark = Spark(Constants.rightSpark)

    private val differentialDrive = DifferentialDrive(leftSpark, rightSpark)

    fun arcadeDrive(throttle: Double, turn: Double) {
        differentialDrive.arcadeDrive(throttle, turn)
    }
}
