package com.tms.homework.han.patterns.creational.newabstractfactory;

import com.tms.homework.han.patterns.creational.newabstractfactory.cars.Car;
import com.tms.homework.han.patterns.creational.newabstractfactory.factories.ProductFactory;
import com.tms.homework.han.patterns.creational.newabstractfactory.planes.Plane;

public class App {
    Car car;
    Plane plane;

    public App(ProductFactory factory) {
        car = factory.createCar();
        plane = factory.createPlane();
    }
}
