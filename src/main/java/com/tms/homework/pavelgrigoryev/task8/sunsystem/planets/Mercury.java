package com.tms.homework.pavelgrigoryev.task8.sunsystem.planets;

import com.tms.homework.pavelgrigoryev.task8.sunsystem.Levitatable;
import com.tms.homework.pavelgrigoryev.task8.sunsystem.Star;

public class Mercury extends Star implements Levitatable {
    public Mercury(long maxDistance, long minDistance, long diameter, double rotationPeriod, int temperature) {
        super(maxDistance, minDistance, diameter, rotationPeriod, temperature);
    }

    @Override
    public void introduce() {
        System.out.println("I am the Mercury");
    }

    @Override
    public void flyInTheVoid() {
        System.out.println("flying around the Sun");
    }
}
