package lib

import kotlin.time.TimeSource

/**
 * An alternative to [Timer.getFPGATimestamp()][edu.wpi.first.wpilibj.Timer.getFPGATimestamp] using the [kotlin.time]
 * library
 */
class Timer {

    private val timeSource = TimeSource.Monotonic

    private var automationTimerStart = timeSource.markNow()
    val elapsed get() = automationTimerStart.elapsedNow()

    fun reset() {
        automationTimerStart = timeSource.markNow()
    }

}