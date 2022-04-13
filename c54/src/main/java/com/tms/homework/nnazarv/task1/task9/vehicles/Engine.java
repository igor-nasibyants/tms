package com.tms.homework.nnazarv.task1.task9.vehicles;

public class Engine {
    private String power;
    private String producer;

    public Engine(String power, String producer) {
        this.power = power;
        this.producer = producer;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "power='" + power + '\'' +
                ", producer='" + producer + '\'' +
                '}';
    }
}
