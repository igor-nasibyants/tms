package com.tms.homework.han.patterns.creational.factorymethod.domain;

public class Car implements IProduction{
    @Override
    public void release() {
        System.out.println("New auto is here!");
    }

    @Override
    public void development() {
        System.out.println("Car in development");
    }
}
