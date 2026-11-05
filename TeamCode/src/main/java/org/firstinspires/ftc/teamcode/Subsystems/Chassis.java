package org.firstinspires.ftc.teamcode.Subsystems;

import org.firstinspires.ftc.teamcode.Hardware;

public class Chassis {
    Hardware hardware;
    public Chassis(Hardware hardware) {
        this.hardware = hardware;
    }
    public void drive(double forward, double strafe, double turn) {
        double frontLeftPower  = forward + strafe + turn;
        double frontRightPower = forward - strafe - turn;
        double backLeftPower   = forward - strafe + turn;
        double backRightPower  = forward + strafe - turn;


        double max = 1.0;
        max = Math.max(max, Math.abs(frontLeftPower));
        max = Math.max(max, Math.abs(frontRightPower));
        max = Math.max(max, Math.abs(backLeftPower));
        max = Math.max(max, Math.abs(backRightPower));

        hardware.fl.setPower(frontLeftPower / max);
        hardware.fr.setPower(frontRightPower / max);
        hardware.bl.setPower(backLeftPower / max);
        hardware.br.setPower(backRightPower / max);
    }

    public void stop() {
        drive(0, 0, 0);
    }
}
