package frc.team253.BobaBot.oi.utils

object XBConstants {
    // Joystick Deadband
    const val DEADBAND = 0.05

    // Buttons
    enum class Button(val id: Int) {
        A(1),
        B(2),
        X(3),
        Y(4),
        LB(5),
        RB(6),
        SELECT(7),
        START(8),
        LEFT_STICK(9),
        RIGHT_STICK(10)
    }

    // Axes
    enum class Axis(val id: Int) {
        LEFT_X(0),
        LEFT_Y(1),
        RIGHT_X(4),
        RIGHT_Y(5),
        LT(2),
        RT(3)
    }

    // D-Pad
    enum class DPad(val id: Int) {
        NONE(-1),
        UP(0),
        UP_RIGHT(45),
        RIGHT(90),
        DOWN_RIGHT(135),
        DOWN(180),
        DOWN_LEFT(225),
        LEFT(270),
        UP_LEFT(315)
    }
}