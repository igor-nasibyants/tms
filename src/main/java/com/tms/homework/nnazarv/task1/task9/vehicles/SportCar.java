package com.tms.homework.nnazarv.task1.task9.vehicles;

import com.tms.homework.nnazarv.task1.task9.Driver;

public class SportCar extends Car{
private double speed;

    public SportCar(String producer, String aClass, double weight, Driver driver, Engine engine, double speed) {
        super(producer, aClass, weight, driver, engine);
        this.speed = speed;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "SportCar{" +
                "speed=" + speed +
                '}';
    }
}
