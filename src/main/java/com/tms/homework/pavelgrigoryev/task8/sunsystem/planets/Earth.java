package com.tms.homework.pavelgrigoryev.task8.sunsystem.planets;

import com.tms.homework.pavelgrigoryev.task8.sunsystem.BigBang;
import com.tms.homework.pavelgrigoryev.task8.sunsystem.MilkyWayable;

public class Earth extends BigBang implements MilkyWayable {
    public Earth(long maxDistance, long minDistance, long diameter, double rotationPeriod, int temperature) {
        super(maxDistance, minDistance, diameter, rotationPeriod, temperature);
    }

    @Override
    public void introduce() {
        System.out.println("I am the Earth");
    }

    @Override
    public void flyInAVoid() {
        System.out.println("flying around the Sun with Mercury");
    }
}
