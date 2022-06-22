package com.tms.homework.astakhnovich.patterns.generating.factory_method.transport;

public class CarBusiness implements Transport {
    @Override
    public void move() {
        System.out.println("я наземное такси, везу по дороге за много денег");
    }
}