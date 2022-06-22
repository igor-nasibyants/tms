package com.tms.homework.astakhnovich.patterns.generating.abstractFactory;


import com.tms.homework.astakhnovich.patterns.generating.abstractFactory.factorys.CarFactory;
import com.tms.homework.astakhnovich.patterns.generating.abstractFactory.factorys.HelicopterFactory;
import com.tms.homework.astakhnovich.patterns.generating.abstractFactory.factorys.ShipFactory;
import com.tms.homework.astakhnovich.patterns.generating.abstractFactory.transport.TaxiType;
import com.tms.homework.astakhnovich.patterns.generating.abstractFactory.transport.Transport;
import com.tms.homework.astakhnovich.patterns.generating.abstractFactory.transport.TransportType;

public class TaxiStation {
    private Transport transport;
    private final CarFactory carFactory = new CarFactory();
    private final HelicopterFactory helicopterFactory = new HelicopterFactory();
    private final ShipFactory shipFactory = new ShipFactory();

    public Transport orderTaxi(TransportType transportType, TaxiType taxiType){

        switch (transportType){
            case CAR -> transport = carFactory.createTransport(taxiType);

            case HELICOPTER -> transport = helicopterFactory.createTransport(taxiType);

            case SHIP -> transport = shipFactory.createTransport(taxiType);
        }
        return transport;
    }
}