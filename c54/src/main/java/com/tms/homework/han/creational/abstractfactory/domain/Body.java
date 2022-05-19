package com.tms.homework.han.creational.abstractfactory.domain;

public class Body implements IBody{
    @Override
    public void createBody() {
        System.out.println("Body created");
    }
}
