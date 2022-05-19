package com.tms.homework.han.creational.builder.car;

import com.tms.homework.han.creational.builder.domain.Car;
import com.tms.homework.han.creational.builder.domain.IConstructor;


public class BMW implements IConstructor {
    private final Car car;

    public BMW() {
        car = new Car();
    }

    @Override
    public void createEngine() {
        car.appendData("Engine is ready for BMW \n");
    }

    @Override
    public void createBody() {
        car.appendData("Body is ready for BMW\n");
    }

    @Override
    public void createElectronic() {
        car.appendData("Electrical equipment is ready for BMW\n");
    }

    @Override
    public Car getReadyCar() {
        return car;
    }

    public Car car() {
        return car;
    }

}
