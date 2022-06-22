package com.tms.homework.astakhnovich.patterns.generating.factory_method;

import com.tms.homework.astakhnovich.patterns.generating.factory_method.transport.Transport;

public class TaxiStation{
    private final CarFactory taxiCarFactory = new CarFactory();

    public Transport orderTaxi(CarType type){
        Transport transport = taxiCarFactory.createTransport(type);
        return transport;
    }
}
