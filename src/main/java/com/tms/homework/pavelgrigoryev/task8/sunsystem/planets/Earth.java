package com.tms.homework.pavelgrigoryev.task8.sunsystem.planets;

import com.tms.homework.pavelgrigoryev.task8.sunsystem.Star;
import com.tms.homework.pavelgrigoryev.task8.sunsystem.Levitatable;

public class Earth extends Star implements Levitatable {
    public Earth(long maxDistance, long minDistance, long diameter, double rotationPeriod, int temperature) {
        super(maxDistance, minDistance, diameter, rotationPeriod, temperature);
    }

    @Override
    public void introduce() {
        System.out.println("I am the Earth");
    }

    @Override
    public void flyInTheVoid() {
        System.out.println("flying around the Sun with Mercury");
    }
}
