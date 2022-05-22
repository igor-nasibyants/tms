package com.tms.homework.han.patterns.behavioral.strategy;

public class BMWModernisation implements Modern {
    @Override
    public void modernisation(String carName) {
        System.out.println("Модернизация BMW прошла успешно, теперь она - " + carName);
    }
}
