package com.tms.homework.pavelgrigoryev.task8.sunsystem.planets;

import com.tms.homework.pavelgrigoryev.task8.sunsystem.BigBang;
import com.tms.homework.pavelgrigoryev.task8.sunsystem.MilkyWayable;

public final class Sun extends BigBang implements MilkyWayable {


    public Sun(long diameter, int temperature) {
        super(diameter, temperature);
    }

    @Override
    public void introduce() {
        System.out.println("I am the Sun");
    }

    @Override
    public void flyInAVoid() {
        System.out.println("flying in the void");
    }
}
