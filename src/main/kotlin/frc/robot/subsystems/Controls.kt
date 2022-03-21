package frc.robot.subsystems

import edu.wpi.first.wpilibj.Joystick
import frc.robot.resources.Constants

object Controls {

    private val moveJoystick = Joystick(Constants.moveJoystick)
    private val intakeJoystick = Joystick(Constants.intakeJoystick)

    val moveX get() = moveJoystick.x
    val moveY get() = moveJoystick.y

    val isLLAim = moveJoystick.getRawButton(1)

    val isShooting get() = intakeJoystick.getRawButton(1)
    val isIntaking get() = intakeJoystick.getRawButton(2)
    val isShooterIntaking get() = intakeJoystick.getRawButton(3)
    val isWinchDown get() = intakeJoystick.getRawButton(4)
    val isWinchUp get() = intakeJoystick.getRawButton(5)

    val isReverseIntaking get() = intakeJoystick.getRawButton(6)
    val isShooterEject get() = intakeJoystick.getRawButton(7)

    val smartIntakeActivation get() = intakeJoystick.getRawButton(8)

}