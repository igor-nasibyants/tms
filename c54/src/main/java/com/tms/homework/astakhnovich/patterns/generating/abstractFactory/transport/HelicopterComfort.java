package com.tms.homework.astakhnovich.patterns.generating.abstractFactory.transport;

public class HelicopterComfort implements Transport {
    @Override
    public void move() {
        System.out.println("я вертолет, везу по воздуху за очень много денег");
    }
}
