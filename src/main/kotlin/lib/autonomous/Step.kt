package lib.autonomous

import lib.Timer

open class Step(
    val condition: (Timer) -> Boolean,
    val onComplete: () -> Unit = {}
) {
    var started = false

    lateinit var timerInstance: Timer
}