package com.tms.homework.han.creational.builder.domain;

public class Director {
    private IConstructor car;

    public Director(IConstructor car) {
        this.car = car;
    }

    public void setCar(IConstructor car) {
        this.car = car;
    }

    public Car releaseCar() {
        car.createBody();
        car.createEngine();
        car.createElectronic();
        return car.getReadyCar();
    }
}
