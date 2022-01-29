package frc.robot.subsystems

import edu.wpi.first.networktables.NetworkTable
import edu.wpi.first.networktables.NetworkTableEntry
import edu.wpi.first.networktables.NetworkTableInstance
import frc.robot.Constants

object Limelight {

    private val networkTable = NetworkTableInstance.getDefault().getTable("limelight")
    private val _tx = networkTable.getEntry("tx")
    private val _ty = networkTable.getEntry("ty")
    private val _ta = networkTable.getEntry("ta")

    val tx get() = _tx.getDouble(Constants.limelightDefaultX)
    val ty get() = _ty.getDouble(Constants.limelightDefaultY)
    val ta get() = _ta.getDouble(Constants.limelightDefaultA)


}