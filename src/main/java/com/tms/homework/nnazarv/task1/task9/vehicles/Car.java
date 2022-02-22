package com.tms.homework.nnazarv.task1.task9.vehicles;

import com.tms.homework.nnazarv.task1.task9.Driver;

public class Car {
    private String producer;
    private String aClass;
    private double weight;
    private Driver driver;
    private Engine engine;

    public Car() {
    }

    public Car(String producer, String aClass, double weight, Driver driver, Engine engine) {
        this.producer = producer;
        this.aClass = aClass;
        this.weight = weight;
        this.driver = driver;
        this.engine = engine;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getaClass() {
        return aClass;
    }

    public void setaClass(String aClass) {
        this.aClass = aClass;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "producer='" + producer + '\'' +
                ", aClass='" + aClass + '\'' +
                ", weight=" + weight +
                ", driver=" + driver +
                ", engine=" + engine +
                '}';
    }
}
