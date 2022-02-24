package com.tms.homework.staryyo.task7;

public class Rifle extends AssaultRifle implements Fire{
    private RifleType rifleType;
    private double calibr;
    private int year;

    public Rifle(RifleType rifleType, double calibr, int year) {
        this.year = year;
        this.rifleType = rifleType;
        this.calibr = calibr;
    }

    public RifleType getRifleType() {
        return rifleType;
    }

    public double getCalibr() {
        return calibr;
    }

    public int getYear() {
        return year;
    }

    @Override
    public void type() {
        super.type();
    }

    @Override
    public void defeatedTheEnemy() {
        super.defeatedTheEnemy();
    }

    @Override
    public void fire() {
        System.out.println("Fire");
    }

    @Override
    public String toString() {
        return "Rifle{" +
                "rifleType=" + rifleType +
                ", calibr=" + calibr +
                ", year=" + year +
                '}';
    }
}
