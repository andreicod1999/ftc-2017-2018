package org.firstinspires.ftc.teamcode.tests;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.core.RobotOpMode;

@TeleOp(name =  "DriveTest", group = "Tests")
public class DriveTest extends RobotOpMode {

    public void runOpMode(){
        startRobot();
        waitForStart();
        while(opModeIsActive()) {
            drive.driveWithGamepad(gamepad1);
            telemetry.addData("x", gamepad1.left_stick_x);
            telemetry.addData("y", gamepad1.left_stick_y);
            telemetry.update();
        }
    }
}
