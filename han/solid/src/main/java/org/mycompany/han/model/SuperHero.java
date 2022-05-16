package org.mycompany.han.model;

import org.mycompany.han.logic.Speakable;
import org.mycompany.han.logic.Superable;

public class SuperHero extends Human implements Superable, Speakable {
    int powerOfSuperPowers;
    String message = "I'm a SuperHero";

    public SuperHero(int age, String name, int powerOfSuperPowers) {
        super(age, name);
        this.powerOfSuperPowers = powerOfSuperPowers;
    }

    public int getPowerOfSuperPowers() {
        return powerOfSuperPowers;
    }

    @Override
    public String superPower() {
        return "Power:" + powerOfSuperPowers;
    }

    @Override
    public String speak() {
        return message;
    }
}
