package com.tms.homework.han.patterns.creational.newabstractfactory.factories;

import com.tms.homework.han.patterns.creational.newabstractfactory.planes.Plane;
import com.tms.homework.han.patterns.creational.newabstractfactory.cars.Car;

public interface ProductFactory {
    Car createCar();
    Plane createPlane();
}
