package frc.robot.subsystems

import edu.wpi.first.networktables.NetworkTable
import edu.wpi.first.networktables.NetworkTableEntry
import edu.wpi.first.networktables.NetworkTableInstance
import frc.robot.Constants

object Limelight {

    private lateinit var _tx: NetworkTableEntry
    private lateinit var _ty: NetworkTableEntry
    private lateinit var _ta: NetworkTableEntry

    val tx get() = _tx.getDouble(Constants.limelightDefaultX)
    val ty get() = _ty.getDouble(Constants.limelightDefaultY)
    val ta get() = _ta.getDouble(Constants.limelightDefaultA)

    fun init() {
        val networkTable = NetworkTableInstance.getDefault().getTable("limelight")
        _tx = networkTable.getEntry("tx")
        _ty = networkTable.getEntry("ty")
        _ta = networkTable.getEntry("ta")
    }

}