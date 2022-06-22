package com.tms.homework.astakhnovich.patterns.generating.abstractFactory.transport;

public class CarComfort implements Transport {
    @Override
    public void move() {
        System.out.println("я наземное такси, везу по дороге за нормально денег");
    }
}