package com.tms.homework.han.creational.abstractfactory.domain;

public class Car implements IProduct {

    @Override
    public void realise(IBody body) {
        body.createBody();
        System.out.println("I'm ready to drive!");
    }
}
