package org.firstinspires.ftc.teamcode.core;

import com.qualcomm.robotcore.hardware.HardwareMap;

public final class Hardware {
    public final Motors motors;
    public final Sensors sensors;

    public Hardware(HardwareMap map) {
        motors = new Motors(map);
        sensors = new Sensors(map);
    }
}