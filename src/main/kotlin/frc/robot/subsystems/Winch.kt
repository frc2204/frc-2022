package frc.robot.subsystems

import edu.wpi.first.wpilibj.DigitalInput
import edu.wpi.first.wpilibj.VictorSP
import frc.robot.resources.Constants

object Winch {

    var smartIntake = false
    private val lowerLimitSwitch = DigitalInput(Constants.intakeLowerLSwitch)
    private val upperLimitSwitch = DigitalInput(Constants.intakeUpperLSwitch)

    fun smartIntakeRaise() { if (!upperLimitSwitch.get()) up() }
    fun smartIntakeLower() { if (!lowerLimitSwitch.get()) down() }

    private val motor = VictorSP(Constants.winchVictorSPPort)
    private const val power = 0.6

    fun up() { motor.set(power) }
    fun down() { motor.set(-power) }
    fun stop() { motor.set(0.0) }

    var previousState = false
    fun smartButtonScan() {
        if (previousState != Controls.smartIntakeActivation) {
            smartIntake = !smartIntake
            previousState = Controls.smartIntakeActivation
        }
    }

}