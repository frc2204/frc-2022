package frc.robot.subsystems

import edu.wpi.first.wpilibj.Timer
import kotlin.time.TimeMark
import kotlin.time.TimeSource

/**
 * A slightly more refined version of the [Timer], implemented with Kotlin and uses the native [kotlin.time] library
 */
object KTimer {

    private val timeSource = TimeSource.Monotonic

    private lateinit var automationTimerStart: TimeMark
    val elapsed get() = automationTimerStart.elapsedNow()
    fun startAutomationTimer() {
        automationTimerStart = timeSource.markNow()
    }

}

