package com.tms.homework.han.task7;

abstract class Car {
    int wheels;
    int engine;
    String color;

    public Car(int wheels, int engine, String color) {
        this.wheels = wheels;
        this.engine = engine;
        this.color = color;
    }

    private void fly() {
    }

    public String saysDriver() {
        return "Я не знаю, что сказать \n";
    }
}

