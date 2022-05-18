package com.tms.homework.han.creational.factorymethod.domain;

public class Truck implements IProduction{
    @Override
    public void release() {
        System.out.println("New truck is here");
    }
}
