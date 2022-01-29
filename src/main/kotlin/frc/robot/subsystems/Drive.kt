package frc.robot.subsystems

import edu.wpi.first.wpilibj.Spark
import edu.wpi.first.wpilibj.drive.DifferentialDrive
import frc.robot.Constants

object Drive {

    private val leftSpark = Spark(Constants.leftSpark)
    private val rightSpark = Spark(Constants.rightSpark)

    private val differentialDrive = DifferentialDrive(leftSpark, rightSpark)

    private val Double.withinDeadZone: Boolean get() = this < Constants.joystickDeadZone

    fun drive(x: Double, y: Double) {
        val actualX = if (!x.withinDeadZone) x else 0.0
        val actualY = if (!y.withinDeadZone) y else 0.0
        arcadeDrive(Pair(actualY, actualX))
    }

    private fun arcadeDrive(pair: Pair<Double, Double>) = arcadeDrive(pair.first, pair.second)

    fun arcadeDrive(throttle: Double, turn: Double) {
        differentialDrive.arcadeDrive(throttle, turn)
    }
}
