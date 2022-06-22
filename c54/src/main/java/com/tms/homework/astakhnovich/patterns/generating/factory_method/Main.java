package com.tms.homework.astakhnovich.patterns.generating.factory_method;

import com.tms.homework.astakhnovich.patterns.generating.factory_method.transport.Transport;

public class Main {
    public static void main(String[] args) {
        TaxiStation taxiStation = new TaxiStation();
        Transport transport = taxiStation.orderTaxi(CarType.BUSINESS);
        transport.move();
    }
}