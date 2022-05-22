package com.tms.homework.han.patterns.creational.factorymethod.domain;

public class Truck implements IProduction{
    @Override
    public void release() {
        System.out.println("New truck is here");
    }

    @Override
    public void development() {
        System.out.println("Truck in development");
    }
}
