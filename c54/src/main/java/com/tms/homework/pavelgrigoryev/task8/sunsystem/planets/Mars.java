package com.tms.homework.pavelgrigoryev.task8.sunsystem.planets;

import com.tms.homework.pavelgrigoryev.task8.sunsystem.Levitatable;
import com.tms.homework.pavelgrigoryev.task8.sunsystem.Star;

public class Mars extends Star implements Levitatable {
    public Mars(long maxDistance, long minDistance, long diameter, double rotationPeriod, int temperature) {
        super(maxDistance, minDistance, diameter, rotationPeriod, temperature);
    }

    @Override
    public void introduce() {
        System.out.println("I am the Mars");
    }

    @Override
    public void flyInTheVoid() {
        System.out.println("flying around the Sun with Mercury and Earth");
    }
}
