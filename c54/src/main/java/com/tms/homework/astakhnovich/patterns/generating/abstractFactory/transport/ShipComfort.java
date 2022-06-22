package com.tms.homework.astakhnovich.patterns.generating.abstractFactory.transport;

public class ShipComfort implements Transport{

    @Override
    public void move() {
        System.out.println("я корабль, везу по воде за много денег");
    }
}
