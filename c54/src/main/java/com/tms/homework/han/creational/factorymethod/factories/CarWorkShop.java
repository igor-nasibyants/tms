package com.tms.homework.han.creational.factorymethod.factories;

import com.tms.homework.han.creational.factorymethod.domain.Car;
import com.tms.homework.han.creational.factorymethod.domain.IProduction;

public class CarWorkShop implements IWorkShop{
    @Override
    public IProduction create() {
        return new Car();
    }
}
