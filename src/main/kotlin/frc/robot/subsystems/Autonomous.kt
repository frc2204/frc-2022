package frc.robot.subsystems

import lib.autonomous.Step
import lib.autonomous.TimedStep
import kotlin.time.milliseconds

object Autonomous {

    val midShootPath = listOf(
        Step({ rightTurn(88.4) }),
        TimedStep(1400.0.milliseconds, { Drive.tankDrive(0.7, 0.7) }, {}),
        TimedStep(500.0.milliseconds, { Drive.stop() }, { navX.reset() }),
        Step({ rightTurn(138.4) }),
        TimedStep(200.0.milliseconds, { Drive.stop() }),
        TimedStep(1700.0.milliseconds, { Drive.tankDrive(0.7, 0.7) }),
        TimedStep(500.0.milliseconds, { Drive.stop() }, { navX.reset() }),
        Step({ rightTurn(120.0) }),
        TimedStep(2000.0.milliseconds, { Drive.stop() }, { navX.reset() }),
        Step({ rightTurn(203.0) }),
        TimedStep(200.0.milliseconds, { Drive.stop() }),
        TimedStep(2700.0.milliseconds, { Drive.tankDrive(0.7, 0.7) }),
        TimedStep(500.0.milliseconds, { Drive.stop() }, { navX.reset() }),
        Step({ rightTurn(165.0) }),
        TimedStep(2500.0.milliseconds, { Drive.tankDrive(0.7, 0.7) })
    )

}