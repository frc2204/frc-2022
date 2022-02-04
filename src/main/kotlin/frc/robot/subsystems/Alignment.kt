package frc.robot.subsystems

import frc.robot.resources.Correction
import kotlin.math.abs
import kotlin.math.roundToInt

object Alignment {

    fun calculateHorizontalCorrection(): Pair<Correction?, Int> { // Returns the correction amount and positivity multiplier
        val tx = Limelight.tx.roundToInt()
        val correctionAmount = when (abs(tx)) {
            in 1..5 -> Correction.Minor
            in 5..10 -> Correction.Mediocre
            in 10..27 -> Correction.Major
            else -> null // No correction when not detected or 0
        }

        return Pair(correctionAmount, if (tx < 0) -1 else 1)
    }

}