package com.tms.homework.han.patterns.behavioral.strategy;

public class AudiModernisation implements Modern {
    @Override
    public void modernisation(String carName) {
        System.out.println("Модернизация Audi прошла успешно, теперь она - " + carName);
    }
}
