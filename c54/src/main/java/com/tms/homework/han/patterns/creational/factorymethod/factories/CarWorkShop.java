package com.tms.homework.han.patterns.creational.factorymethod.factories;

import com.tms.homework.han.patterns.creational.factorymethod.domain.Car;

public class CarWorkShop implements IWorkShop<Car>{
    @Override
    public Car create() {
        return new Car();
    }
}
