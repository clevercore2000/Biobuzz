package org.firstinspires.ftc.teamcode.Subsystems;

import org.firstinspires.ftc.teamcode.Constants;
import org.firstinspires.ftc.teamcode.Hardware;

public class Outtake {
    private final Hardware hardware;
    private boolean isActive;
    public Outtake(Hardware hardware) {
        this.hardware = hardware;
    }

    public void start(double powf, double powb) {
        hardware.outb.setPower(powb);
        hardware.outf.setPower(powf);
    }
    public void start() {
        start(Constants.Outtake.FRONT_ROLLER_POWER, Constants.Outtake.BACK_ROLLER_POWER);
    }
    public void stop() {
        start(0, 0);
    }
    public void toggle() {
        if(isActive) start();
        else stop();
    }
}
