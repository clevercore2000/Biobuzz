package org.firstinspires.ftc.teamcode.OpModes;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.Hardware;
import org.firstinspires.ftc.teamcode.Subsystems.Chassis;
import org.firstinspires.ftc.teamcode.Subsystems.Intake;
import org.firstinspires.ftc.teamcode.Subsystems.Outtake;
import org.firstinspires.ftc.teamcode.Subsystems.Transfer;

@TeleOp
public class TeleOp1 extends LinearOpMode {

    @Override
    public void runOpMode() throws InterruptedException {

        Hardware hardware = new Hardware(hardwareMap);
        Chassis chassis = new Chassis(hardware);
        Intake intake = new Intake(hardware);
        Outtake outtake = new Outtake(hardware);
        Transfer transfer = new Transfer(hardware);

        waitForStart();
        while (opModeIsActive()) {
            chassis.drive(gamepad1.left_stick_y, gamepad1.left_stick_x, gamepad1.right_stick_x);
            if(gamepad2.a) {
                intake.start();
                transfer.start();
            }
            else {
                intake.stop();
                transfer.stop();
            }

            if(gamepad2.xWasPressed()) outtake.toggle();
        }
    }
}
