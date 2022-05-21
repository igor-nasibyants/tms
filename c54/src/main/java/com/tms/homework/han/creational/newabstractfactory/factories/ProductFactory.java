package com.tms.homework.han.creational.newabstractfactory.factories;

import com.tms.homework.han.creational.newabstractfactory.planes.Plane;
import com.tms.homework.han.creational.newabstractfactory.cars.Car;

public interface ProductFactory {
    Car createCar();
    Plane createPlane();
}
