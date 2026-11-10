package org.firstinspires.ftc.teamcode.Subsystems;

import org.firstinspires.ftc.teamcode.Constants;
import org.firstinspires.ftc.teamcode.Hardware;

public class Transfer {
    private final Hardware hardware;
    public Transfer(Hardware hardware) {
        this.hardware = hardware;
    }

    public void start(double pow) {
        hardware.transfer.setPower(pow);
    }
    public void start() {
        start(Constants.Transfer.TRANSFER_POWER);
    }
    public void reverse() {
        start(-Constants.Transfer.TRANSFER_POWER);
    }
    public void stop() {
        start(0);
    }
}
