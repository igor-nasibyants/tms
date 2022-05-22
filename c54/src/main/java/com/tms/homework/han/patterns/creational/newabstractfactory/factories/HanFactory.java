package com.tms.homework.han.patterns.creational.newabstractfactory.factories;

import com.tms.homework.han.patterns.creational.newabstractfactory.planes.Plane;
import com.tms.homework.han.patterns.creational.newabstractfactory.cars.Car;
import com.tms.homework.han.patterns.creational.newabstractfactory.cars.CarHan;
import com.tms.homework.han.patterns.creational.newabstractfactory.planes.PlaneHan;

public class HanFactory implements ProductFactory {
    @Override
    public Car createCar() {
        System.out.println("Han Car is created");
        return new CarHan();
    }

    @Override
    public Plane createPlane() {
        System.out.println("Han Plane is created");
        return new PlaneHan();
    }
}
