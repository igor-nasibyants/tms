package com.tms.homework.han.patterns.creational.factorymethod.factories;

import com.tms.homework.han.patterns.creational.factorymethod.domain.Truck;

public class TruckWorkShop implements IWorkShop<Truck>{
    @Override
    public Truck create() {
        return new Truck();
    }
}
