package com.tms.homework.nikitaelenski.task18;

import java.util.Arrays;

public class AngryBirds {
    private String birdName ;
    private String strength ;
    private String [] hats ;
    private Integer power ;


    public AngryBirds(String birdName, String strength, String[] hats, Integer power) {
        this.birdName = birdName;
        this.strength = strength;
        this.hats = hats;
        this.power = power;
    }

    public String getBirdName() {
        return birdName;
    }

    public void setBirdName(String birdName) {
        this.birdName = birdName;
    }

    public String getStrength() {
        return strength;
    }

    public void setStrength(String strength) {
        this.strength = strength;
    }

    public String[] getHats() {
        return hats;
    }

    public void setHats(String[] hats) {
        this.hats = hats;
    }

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "AngryBirds{" +
                "birdName='" + birdName + '\'' +
                ", strength='" + strength + '\'' +
                ", hats=" + Arrays.toString(hats) +
                ", power=" + power +
                '}';
    }
}

