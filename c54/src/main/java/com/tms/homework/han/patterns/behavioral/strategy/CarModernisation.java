package com.tms.homework.han.patterns.behavioral.strategy;

public class CarModernisation {
    private Modern modern;

    public CarModernisation(Modern modern) {
        this.modern = modern;
    }

    public void setModern(Modern modern) {
        this.modern = modern;
    }

    public void update(String carName) {
        modern.modernisation(carName);
    }
}
