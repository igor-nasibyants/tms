package com.tms.homework.astakhnovich.patterns.generating.abstractFactory.transport;

public class CarBusiness implements Transport {
    @Override
    public void move() {
        System.out.println("я наземное такси, везу по дороге за много денег");
    }
}