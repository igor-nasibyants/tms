package com.tms.homework.han.creational.factorymethod.factories;

import com.tms.homework.han.creational.factorymethod.domain.Car;

public class CarWorkShop implements IWorkShop<Car>{
    @Override
    public Car create() {
        return new Car();
    }
}
