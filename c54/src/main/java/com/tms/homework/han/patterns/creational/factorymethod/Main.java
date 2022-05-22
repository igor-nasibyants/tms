package com.tms.homework.han.patterns.creational.factorymethod;

import com.tms.homework.han.patterns.creational.factorymethod.domain.*;
import com.tms.homework.han.patterns.creational.factorymethod.factories.BMWWorkShop;
import com.tms.homework.han.patterns.creational.factorymethod.factories.CarWorkShop;
import com.tms.homework.han.patterns.creational.factorymethod.factories.IWorkShop;
import com.tms.homework.han.patterns.creational.factorymethod.factories.TruckWorkShop;


public class Main {
    public static void main(String[] args) {
        IWorkShop<Car> creatorCar = new CarWorkShop();
        IWorkShop<Truck> creatorTruck = new TruckWorkShop();
        IWorkShop<BMW> creatorBMW = new BMWWorkShop();

        IProduction truck = creatorTruck.create();
        IProduction car = creatorCar.create();
        DevProduct bmw = creatorBMW.create();

        car.development();
        car.release();
        truck.development();
        truck.release();
        bmw.development();
    }
}
