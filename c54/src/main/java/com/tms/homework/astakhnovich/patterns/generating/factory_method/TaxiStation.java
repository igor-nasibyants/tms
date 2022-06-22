package com.tms.homework.astakhnovich.patterns.generating.factory_method;

public class TaxiStation implements Transport{
    TaxiCarFactory taxiCarFactory;

    public TaxiStation(TaxiCarFactory taxiCarFactory) {
        this.taxiCarFactory = taxiCarFactory;
    }

    public Transport orderTaxi(CarType type){
        Transport transport = taxiCarFactory.createTransport(type);
        return transport;
    }

    @Override
    public void move() {
        System.out.println("просто везу");
    }
}
