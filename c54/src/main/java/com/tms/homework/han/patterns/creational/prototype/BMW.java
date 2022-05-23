package com.tms.homework.han.patterns.creational.prototype;

public class BMW implements Car {
    private String name;

    public BMW() {
    }

    public BMW(BMW car) {
        this.name = car.name;
    }


    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Car clone() {
        return new BMW(this);
    }
}
