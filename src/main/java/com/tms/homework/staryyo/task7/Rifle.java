package com.tms.homework.staryyo.task7;

public class Rifle extends AssaultRifle {
    public RifleType rifleType;
    private double calibr;
    private int year;

    public Rifle(RifleType rifleType, double calibr, int year) {
        this.year = year;
        this.rifleType = rifleType;
        this.calibr = calibr;
    }

    @Override
    public void type() {
        super.type();
    }

    @Override
    public void defeatedTheEnemy() {
        super.defeatedTheEnemy();
    }

    public String toString() {
        return "rifle " + rifleType + ", " + calibr + ", " + year;
    }
}
