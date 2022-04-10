package com.tms.homework.nikitaelenski.task18;

import com.google.gson.annotations.SerializedName;

public class AngryClass {
    @SerializedName("birdName")
    private String birdName;
    @SerializedName("strength")
    private String strength;
    @SerializedName("hats")
    private String[] hats;
    @SerializedName("power")
    private int power;

    public AngryClass(String birdName, String strength, String[] hats, int power) {
        this.birdName = birdName;
        this.strength = strength;
        this.hats = hats;
        this.power = power;
    }

    public AngryClass() {
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

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
