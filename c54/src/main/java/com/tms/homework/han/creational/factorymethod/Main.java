package com.tms.homework.han.creational.factorymethod;

import com.tms.homework.han.creational.factorymethod.domain.IProduction;
import com.tms.homework.han.creational.factorymethod.factories.CarWorkShop;
import com.tms.homework.han.creational.factorymethod.factories.IWorkShop;
import com.tms.homework.han.creational.factorymethod.factories.TruckWorkShop;

public class Main {
    public static void main(String[] args) {
        IWorkShop creator = new CarWorkShop();
        IProduction car = creator.create();
        creator = new TruckWorkShop();
        IProduction truck = creator.create();
        car.release();
        truck.release();
    }
}
