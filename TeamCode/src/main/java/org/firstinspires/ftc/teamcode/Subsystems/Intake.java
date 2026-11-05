package org.firstinspires.ftc.teamcode.Subsystems;

import org.firstinspires.ftc.teamcode.Constants;
import org.firstinspires.ftc.teamcode.Hardware;

public class Intake {
    private final Hardware hardware;
    public Intake(Hardware hardware) {
        this.hardware = hardware;
    }

    public void start(double pow) {
        hardware.intake.setPower(pow);
    }
    public void start() {
        start(Constants.Intake.INTAKE_POWER);
    }
    public void stop() {
        start(0);
    }
}
