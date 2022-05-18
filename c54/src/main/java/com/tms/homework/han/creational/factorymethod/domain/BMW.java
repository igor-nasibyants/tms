package com.tms.homework.han.creational.factorymethod.domain;

public class BMW extends Car implements DevProduct {

    @Override
    public void development() {
        System.out.println("Hello! I'm BMW-Audi. In development");
    }

    @Override
    public void release() {
        System.out.println("BMW-Audi is here!");
    }
}
