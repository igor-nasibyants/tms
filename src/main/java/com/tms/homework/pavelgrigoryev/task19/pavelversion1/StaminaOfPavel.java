package com.tms.homework.pavelgrigoryev.task19.pavelversion1;

import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class StaminaOfPavel {
    private String name;
    private int stamina;

    public StaminaOfPavel() {
    }

    public StaminaOfPavel(String name, int stamina) {
        this.name = name;
        this.stamina = stamina;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    @Override
    public String toString() {
        return "StaminaOfPavel{" +
                "name='" + name + '\'' +
                ", stamina=" + stamina +
                '}';
    }
}
