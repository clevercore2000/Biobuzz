package org.firstinspires.ftc.teamcode;

import com.acmerobotics.dashboard.config.Config;

public class Constants {
    @Config("Intake")
    public static class Intake {
        public static double INTAKE_POWER = 1;
    }
    @Config("Transfer")
    public static class Transfer {
        public static double TRANSFER_POWER = 1;
    }
    @Config("Outtake")
    public static class Outtake {
        public static double FRONT_ROLLER_POWER = 0.8;
        public static double BACK_ROLLER_POWER = 1;
    }
}
