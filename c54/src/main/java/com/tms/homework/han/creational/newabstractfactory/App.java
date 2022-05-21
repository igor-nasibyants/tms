package com.tms.homework.han.creational.newabstractfactory;

import com.tms.homework.han.creational.newabstractfactory.cars.Car;
import com.tms.homework.han.creational.newabstractfactory.factories.ProductFactory;
import com.tms.homework.han.creational.newabstractfactory.planes.Plane;

public class App {
    Car car;
    Plane plane;

    public App(ProductFactory factory) {
        car = factory.createCar();
        plane = factory.createPlane();
    }
}
