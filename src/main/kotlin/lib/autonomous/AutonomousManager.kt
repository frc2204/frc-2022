package lib.autonomous

import lib.Timer

class AutonomousManager(private val steps: List<Step>) {

    lateinit var timer: Timer

    var currentStepIndex = 0

    /**
     * Should be called in the [autonomousInit()][edu.wpi.first.wpilibj.TimedRobot.autonomousInit]
     */
    fun start() {
        currentStepIndex = 0
        timer = Timer()
    }

    fun execute() {
        steps[currentStepIndex].apply {
            if (!started) timerInstance = Timer()
            else {
                if (condition(timerInstance)) {
                    onComplete()
                    currentStepIndex++
                }
            }
        }

    }
    
}