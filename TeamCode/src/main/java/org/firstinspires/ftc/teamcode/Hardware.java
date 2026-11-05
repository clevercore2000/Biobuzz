package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class Hardware {
    public DcMotor fl;
    public DcMotor fr;
    public DcMotor bl;
    public DcMotor br;

    public DcMotor intake;
    public DcMotor transfer;
    public DcMotor outf;
    public DcMotor outb;
    public Hardware(HardwareMap hm) {
        fl = hm.get(DcMotor.class, "fl");
        fr = hm.get(DcMotor.class, "fr");
        bl = hm.get(DcMotor.class, "bl");
        br = hm.get(DcMotor.class, "br");

        intake = hm.get(DcMotor.class, "in");
        transfer = hm.get(DcMotor.class, "trans");
        outb = hm.get(DcMotor.class, "ob");
        outf = hm.get(DcMotor.class, "of");

        fr.setDirection(DcMotorSimple.Direction.REVERSE);
        br.setDirection(DcMotorSimple.Direction.REVERSE);
    }
}
