package com.tms.homework.han.creational.builder.bmw;

import com.tms.homework.han.creational.builder.domain.Car;
import com.tms.homework.han.creational.builder.domain.IConstructor;


public class Audi implements IConstructor {
    private final Car car;

    public Audi() {
        car = new Car();
    }

    @Override
    public void createEngine() {
        car.appendData("Engine is ready for Audi \n");
    }

    @Override
    public void createBody() {
        car.appendData("Body is ready for Audi\n");
    }

    @Override
    public void createElectronic() {
        car.appendData("Electrical equipment is ready for Audi");
    }

    @Override
    public Car getReadyCar() {
        return car;
    }

    public Car car() {
        return car;
    }
}
