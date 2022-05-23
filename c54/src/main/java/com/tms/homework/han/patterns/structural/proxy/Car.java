package com.tms.homework.han.patterns.structural.proxy;

public class Car implements BuyCar {

    @Override
    public String buyNewCar(String carName) {
        return "Купили новый автомобиль с названием - " + carName;
    }
}
