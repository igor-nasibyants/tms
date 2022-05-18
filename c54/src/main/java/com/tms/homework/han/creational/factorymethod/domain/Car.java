package com.tms.homework.han.creational.factorymethod.domain;

public class Car implements IProduction{
    @Override
    public void release() {
        System.out.println("New auto is here!");
    }
}
