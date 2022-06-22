package com.tms.homework.astakhnovich.patterns.generating.abstractFactory.factorys;

import com.tms.homework.astakhnovich.patterns.generating.abstractFactory.transport.HelicopterBusiness;
import com.tms.homework.astakhnovich.patterns.generating.abstractFactory.transport.HelicopterComfort;
import com.tms.homework.astakhnovich.patterns.generating.abstractFactory.transport.TaxiType;
import com.tms.homework.astakhnovich.patterns.generating.abstractFactory.transport.Transport;

public class HelicopterFactory implements TransportFactory{

    public Transport createTransport (TaxiType type) {
        Transport helicopter = null;

        switch (type){
            case COMFORT -> helicopter = new HelicopterComfort();
            case BUSINESS -> helicopter = new HelicopterBusiness();
        }
        return helicopter;
    }
}