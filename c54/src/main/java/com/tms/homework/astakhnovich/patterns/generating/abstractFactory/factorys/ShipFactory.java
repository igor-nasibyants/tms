package com.tms.homework.astakhnovich.patterns.generating.abstractFactory.factorys;

import com.tms.homework.astakhnovich.patterns.generating.abstractFactory.transport.ShipBusiness;
import com.tms.homework.astakhnovich.patterns.generating.abstractFactory.transport.ShipComfort;
import com.tms.homework.astakhnovich.patterns.generating.abstractFactory.transport.TaxiType;
import com.tms.homework.astakhnovich.patterns.generating.abstractFactory.transport.Transport;

public class ShipFactory implements TransportFactory{

    public Transport createTransport (TaxiType type) {
        Transport ship = null;

        switch (type){
            case COMFORT -> ship = new ShipComfort();
            case BUSINESS -> ship = new ShipBusiness();
        }
        return ship;
    }
}