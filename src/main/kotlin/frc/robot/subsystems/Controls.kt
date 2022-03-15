package frc.robot.subsystems

import edu.wpi.first.wpilibj.Joystick
import frc.robot.resources.Constants

object Controls {

    private val moveJoystick = Joystick(Constants.moveJoystick)

    val moveX get() = moveJoystick.x
    val moveY get() = moveJoystick.y

    val isShooting get() = moveJoystick.getRawButton(1)

    val isClimberUp get() = moveJoystick.getRawButton(6)
    val isClimberDown get() = moveJoystick.getRawButton(7)

}