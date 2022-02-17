package com.tms.homework.asilius1.task6;


public class Engine {
    private double power;
    private String type;
    private String model;

    public Engine() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPower() {
        return power;
    }

    public String getModel() {
        return model;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "power=" + power +
                ", type='" + type + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}