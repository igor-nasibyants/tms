package com.tms.homework.nikitaelenski.task18;

public class BossPig {
    private String pigName ;
    private String strength ;
    private Integer power ;

    public BossPig(String pigName, String strength, Integer power) {
        this.pigName = pigName;
        this.strength = strength;
        this.power = power;
    }

    public String getPigName() {
        return pigName;
    }

    public void setPigName(String pigName) {
        this.pigName = pigName;
    }

    public String getStrength() {
        return strength;
    }

    public void setStrength(String strength) {
        this.strength = strength;
    }

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }
}
