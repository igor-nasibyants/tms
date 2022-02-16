package com.tms.homework.pavelgrigoryev.task8.sunsystem;

public class BigBang {
    private long maxDistance;
    private long minDistance;
    private final long diameter;
    private double rotationPeriod;
    private final int temperature;

    public BigBang(long maxDistance, long minDistance, long diameter, double rotationPeriod, int temperature) {
        this.maxDistance = maxDistance;
        this.minDistance = minDistance;
        this.diameter = diameter;
        this.rotationPeriod = rotationPeriod;
        this.temperature = temperature;
    }
    public BigBang(long diameter, int temperature) {
        this.diameter = diameter;
        this.temperature = temperature;
    }
    public long getMaxDistance() {
        return maxDistance;
    }
    public long getMinDistance() {
        return minDistance;
    }
    public long getDiameter() {
        return diameter;
    }
    public double getRotationPeriod() {
        return rotationPeriod;
    }
    public int getTemperature() {
        return temperature;
    }
}
