package com.tms.homework.han.patterns.creational.abstractfactory.domain;

public class Plane implements IProduct {


    @Override
    public void realise(IBody body) {
        body.createBody();
        System.out.println("I'm ready to fly!");
    }
}
