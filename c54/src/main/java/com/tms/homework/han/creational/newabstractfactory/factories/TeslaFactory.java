package com.tms.homework.han.creational.newabstractfactory.factories;

import com.tms.homework.han.creational.newabstractfactory.planes.Plane;
import com.tms.homework.han.creational.newabstractfactory.cars.Car;
import com.tms.homework.han.creational.newabstractfactory.cars.CarTesla;
import com.tms.homework.han.creational.newabstractfactory.planes.PlaneTesla;

public class TeslaFactory implements ProductFactory{

    @Override
    public Car createCar() {
        System.out.println("Tesla Car is created");
        return new CarTesla();
    }

    @Override
    public Plane createPlane() {
        System.out.println("Tesla Plane is created");
        return new PlaneTesla();
    }
}
