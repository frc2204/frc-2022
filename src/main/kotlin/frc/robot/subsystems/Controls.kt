package frc.robot.subsystems

import edu.wpi.first.wpilibj.Joystick
import frc.robot.resources.Constants

object Controls {

    private val moveJoystick = Joystick(Constants.moveJoystick)

    val moveX get() = moveJoystick.x
    val moveY get() = moveJoystick.y

    val isShooting get() = moveJoystick.getRawButton(1)
    val isIntaking get() = moveJoystick.getRawButton(2)
    val isShooterIntaking get() = moveJoystick.getRawButton(3)
    val isWinchDown get() = moveJoystick.getRawButton(4)
    val isWinchUp get() = moveJoystick.getRawButton(5)

    val isReverseIntaking get() = moveJoystick.getRawButton(6)
    val isShooterEject get() = moveJoystick.getRawButton(7)

}