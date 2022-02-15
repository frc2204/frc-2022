package frc.robot.subsystems

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard
import frc.robot.resources.Correction

object Dashboard {

    fun updateDashboard(correction: Pair<Correction?, Int>) {
        SmartDashboard.putNumber("Limelight X", Limelight.tx)
        SmartDashboard.putNumber("Limelight Y", Limelight.ty)
        SmartDashboard.putNumber("Limelight A", Limelight.ta)

        SmartDashboard.putString("Correction Amount", correction.first.toString())

        SmartDashboard.putBoolean("Shooting", Controls.isShooting)
        SmartDashboard.putBoolean("Target Detected", correction.first != null)

        SmartDashboard.putNumber("Controls X", Controls.moveX)
        SmartDashboard.putNumber("Controls Y", Controls.moveY)
    }

}