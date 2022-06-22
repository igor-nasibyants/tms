package com.tms.homework.astakhnovich.patterns.generating.factory_method;

public class Main {
    public static void main(String[] args) {
        TaxiCarFactory taxiCarFactory = new TaxiCarFactory();
        TaxiStation taxiStation = new TaxiStation(taxiCarFactory);
        Transport transport = taxiStation.orderTaxi(CarType.BUSINESS);
        transport.move();
    }
}
