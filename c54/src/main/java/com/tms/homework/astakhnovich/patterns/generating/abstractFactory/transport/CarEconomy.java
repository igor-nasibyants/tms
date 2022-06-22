package com.tms.homework.astakhnovich.patterns.generating.abstractFactory.transport;

public class CarEconomy implements Transport {
    @Override
    public void move() {
        System.out.println("я наземное такси, везу по дороге за мало денег");
    }
}