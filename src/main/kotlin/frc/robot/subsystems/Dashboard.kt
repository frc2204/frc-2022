package frc.robot.subsystems

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard
import frc.robot.resources.Correction

object Dashboard {

    fun updateDashboard(correction: Pair<Correction?, Int>) {
        // Limelight
        SmartDashboard.putNumber("Limelight X", Limelight.tx)
        SmartDashboard.putNumber("Limelight Y", Limelight.ty)
        SmartDashboard.putNumber("Limelight A", Limelight.ta)

        SmartDashboard.putString("Correction Amount", correction.first.toString())

        SmartDashboard.putBoolean("Shooting", Controls.isShooting)
        SmartDashboard.putBoolean("Target Detected", correction.first != null)

        SmartDashboard.putBoolean("Smart Intake", Winch.smartIntake)

        //Joysticks
        SmartDashboard.putNumber("Controls X", Controls.moveX)
        SmartDashboard.putNumber("Controls Y", Controls.moveY)

        // NavX
        SmartDashboard.putBoolean("NavX Connection", navX.isConnected)
        SmartDashboard.putNumber("NavX Rate", navX.rate)
        SmartDashboard.putNumber("NavX Angle", navX.angle)
        SmartDashboard.putNumber("NavX Pitch", navX.pitch.toDouble())
        SmartDashboard.putNumber("NavX Roll", navX.roll.toDouble())
        SmartDashboard.putNumber("NavX Compass Heading", navX.compassHeading.toDouble())
        SmartDashboard.putNumber("NavX Fused Heading", navX.fusedHeading.toDouble())
        SmartDashboard.putNumber("NavX X Acceleration", navX.worldLinearAccelX.toDouble())
        SmartDashboard.putNumber("NavX Y Acceleration", navX.worldLinearAccelY.toDouble())
        SmartDashboard.putNumber("NavX Z Acceleration", navX.worldLinearAccelZ.toDouble())
        SmartDashboard.putNumber("NavX X Displacement", navX.displacementX.toDouble())
        SmartDashboard.putNumber("NavX Y Displacement", navX.displacementY.toDouble())
        SmartDashboard.putNumber("NavX Z Displacement", navX.displacementZ.toDouble())
    }

}