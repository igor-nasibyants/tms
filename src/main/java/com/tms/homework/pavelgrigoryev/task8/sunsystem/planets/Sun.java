package com.tms.homework.pavelgrigoryev.task8.sunsystem.planets;

import com.tms.homework.pavelgrigoryev.task8.sunsystem.Star;
import com.tms.homework.pavelgrigoryev.task8.sunsystem.Levitatable;

public final class Sun extends Star implements Levitatable {


    public Sun(long diameter, int temperature) {
        super(diameter, temperature);
    }

    @Override
    public void introduce() {
        System.out.println("I am the Sun");
    }

    @Override
    public void flyInTheVoid() {
        System.out.println("flying in the void");
    }
}
