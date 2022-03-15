package frc.robot.subsystems

object Autonomous {

    var stepCounter = 0

    var dataMap = mutableMapOf<String, Double>()

    fun midShootPath(elapsedTime: Double) {
        when(stepCounter) {
            0 -> {
                if (rightTurn(88.4)) {
                    stepCounter++
                }
            }
            1 -> {
                val timeStart = dataMap.getOrPut("step1_start") { elapsedTime }
                val timeDifference = elapsedTime - timeStart
                if (timeDifference < 1400.00) {
                    Drive.tankDrive(0.7, 0.7)
                } else stepCounter++
            }
            2 -> {
                val timeStart = dataMap.getOrPut("step2_start") { elapsedTime }
                val timeDifference = elapsedTime - timeStart
                if (timeDifference < 500) {
                    Drive.tankDrive(0.0, 0.0)
                } else {
                    stepCounter++
                    navX.reset()
                }
            }
            3 -> {
                if (rightTurn(138.4)) {
                    stepCounter++
                }
            }
            4 -> {
                val timeStart = dataMap.getOrPut("step4_start") { elapsedTime }
                val timeDifference = elapsedTime - timeStart
                if (timeDifference < 200) {
                    Drive.tankDrive(0.0, 0.0)
                } else {
                    stepCounter++
                    navX.reset()
                }
            }
            5 -> {
                val timeStart = dataMap.getOrPut("step5_start") { elapsedTime }
                val timeDifference = elapsedTime - timeStart
                if (timeDifference < 1700.00) {
                    Drive.tankDrive(0.7, 0.7)
                } else stepCounter++
            }
            6 -> {
                val timeStart = dataMap.getOrPut("step6_start") { elapsedTime }
                val timeDifference = elapsedTime - timeStart
                if (timeDifference < 500) {
                    Drive.tankDrive(0.0, 0.0)
                } else {
                    stepCounter++
                    navX.reset()
                }
            }
            7 -> {
                if (rightTurn(120.0)) {
                    stepCounter++
                }
            }
            8 -> {
                val timeStart = dataMap.getOrPut("step8_start") { elapsedTime }
                val timeDifference = elapsedTime - timeStart
                if (timeDifference < 2000) {
                    Drive.tankDrive(0.0, 0.0)
                } else {
                    stepCounter++
                    navX.reset()
                }
            }
            9 -> {
                if (rightTurn(203.0)) {
                    stepCounter++
                }
            }
            10 -> {
                val timeStart = dataMap.getOrPut("step10_start") { elapsedTime }
                val timeDifference = elapsedTime - timeStart
                if (timeDifference < 200) {
                    Drive.tankDrive(0.0, 0.0)
                } else {
                    stepCounter++
                    navX.reset()
                }
            }
            11 -> {
                val timeStart = dataMap.getOrPut("step11_start") { elapsedTime }
                val timeDifference = elapsedTime - timeStart
                if (timeDifference < 2700.00) {
                    Drive.tankDrive(0.7, 0.7)
                } else stepCounter++
            }
            12 -> {
                val timeStart = dataMap.getOrPut("step12_start") { elapsedTime }
                val timeDifference = elapsedTime - timeStart
                if (timeDifference < 500) {
                    Drive.tankDrive(0.0, 0.0)
                } else {
                    stepCounter++
                    navX.reset()
                }
            }
            13 -> {
                if (rightTurn(165.0)) {
                    stepCounter++
                }
            }
            14 -> {
                val timeStart = dataMap.getOrPut("step14_start") { elapsedTime }
                val timeDifference = elapsedTime - timeStart
                if (timeDifference < 2500.00) {
                    Drive.tankDrive(0.7, 0.7)
                } else stepCounter++
                }
            15 -> {
                val timeStart = dataMap.getOrPut("step15_start") { elapsedTime }
                val timeDifference = elapsedTime - timeStart
                if (timeDifference < 2000) {
                    Drive.tankDrive(0.0, 0.0)
                } else {
                    stepCounter++
                    navX.reset()
                }
            }
        }
    }

}