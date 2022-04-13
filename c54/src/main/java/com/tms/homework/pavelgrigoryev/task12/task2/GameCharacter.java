package com.tms.homework.pavelgrigoryev.task12.task2;

import java.io.Serializable;
import java.util.Arrays;

public class GameCharacter implements Serializable {
    private final String name;
    private final int power;
    private final String type;
    private final String[] weapons;
    private final transient String personalID;

    public GameCharacter(String name, int power, String type, String[] weapons, String personalID) {
        this.name = name;
        this.power = power;
        this.type = type;
        this.weapons = weapons;
        this.personalID = personalID;
    }

    @Override
    public String toString() {
        return "GameCharacter{" +
                "name='" + name + '\'' +
                ", power=" + power +
                ", type='" + type + '\'' +
                ", weapons=" + Arrays.toString(weapons) +
                ", personalID='" + personalID + '\'' +
                '}';
    }
}
