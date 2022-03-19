package lib.autonomous

import kotlin.time.Duration

class TimedStep(private val duration: Duration, action: () -> Unit, onComplete: () -> Unit = {}): Step(
    {
        action()
        duration < it.elapsed
    }, onComplete
)