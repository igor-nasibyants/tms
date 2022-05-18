package com.tms.homework.han.creational.factorymethod.factories;

import com.tms.homework.han.creational.factorymethod.domain.Truck;

public class TruckWorkShop implements IWorkShop<Truck>{
    @Override
    public Truck create() {
        return new Truck();
    }
}
