package org.firstinspires.ftc.teamcode.systems;

import org.firstinspires.ftc.robotcore.external.Telemetry;
import org.firstinspires.ftc.teamcode.core.Motors;
import static org.firstinspires.ftc.teamcode.core.Utility.clamp1;

public final class Drive {
    private Motors motors;

    public Drive(Motors motors) {
        this.motors = motors;
    }

    /// @param x gamepad1 X
    /// @param y gamepad1 y
    /// @param z gamepad2 x
    public void driveWithGamepad(double x, double y, double z) {
        motors.frontLeft.setPower(clamp1(y - x + z));
        motors.frontRight.setPower(clamp1(y + x - z));
        motors.backLeft.setPower(clamp1(y + x + z));
        motors.backRight.setPower(clamp1(y - x - z));
    }

    public void printPower(Telemetry telemetry) {
        telemetry.addData("Front left", String.valueOf(motors.frontLeft.getPower()));
        telemetry.addData("Front right", String.valueOf(motors.frontRight.getPower()));
        telemetry.addData("Back left", String.valueOf(motors.backLeft.getPower()));
        telemetry.addData("Back right", String.valueOf(motors.backRight.getPower()));
    }
}
