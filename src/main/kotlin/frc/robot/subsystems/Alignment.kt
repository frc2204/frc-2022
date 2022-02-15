package frc.robot.subsystems

import frc.robot.resources.Correction
import kotlin.math.abs

object Alignment {

    fun calculateHorizontalCorrection(): Pair<Correction?, Int> { // Returns the correction amount and positivity multiplier
        val tx = Limelight.tx
        val correctionAmount = when (abs(tx)) {
            in 0.1..1.0 -> Correction.Push
            in 1.0..8.0 -> Correction.Minor
            in 8.0..15.0 -> Correction.Mediocre
            in 15.0..27.0 -> Correction.Major
            else -> null // No correction when not detected or 0
        }

        return Pair(correctionAmount, if (tx < 0) -1 else 1)
    }

}