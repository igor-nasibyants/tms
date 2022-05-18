package com.tms.homework.han.creational.factorymethod.factories;

import com.tms.homework.han.creational.factorymethod.domain.IProduction;
import com.tms.homework.han.creational.factorymethod.domain.Truck;

public class TruckWorkShop implements IWorkShop{
    @Override
    public IProduction create() {
        return new Truck();
    }
}
