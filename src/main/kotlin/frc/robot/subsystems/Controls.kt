package frc.robot.subsystems

import edu.wpi.first.wpilibj.Joystick
import frc.robot.Constants

object Controls {

    private val moveJoystick = Joystick(Constants.moveJoystick)

    val moveX get() = moveJoystick.x
    val moveY get() = moveJoystick.y

    val isShooting get() = moveJoystick.triggerPressed

}