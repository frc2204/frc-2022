package frc.robot.resources

enum class Correction(val amount: Double) {

    Push(0.35),
    Minor(0.65),
    Mediocre(0.75),
    Major(1.0)

}