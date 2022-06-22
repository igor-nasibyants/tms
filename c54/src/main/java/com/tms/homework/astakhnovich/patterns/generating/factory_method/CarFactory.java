package com.tms.homework.astakhnovich.patterns.generating.factory_method;

import com.tms.homework.astakhnovich.patterns.generating.factory_method.transport.CarBusiness;
import com.tms.homework.astakhnovich.patterns.generating.factory_method.transport.CarComfort;
import com.tms.homework.astakhnovich.patterns.generating.factory_method.transport.CarEconomy;
import com.tms.homework.astakhnovich.patterns.generating.factory_method.transport.Transport;

public class CarFactory {
    public Transport createTransport (CarType type) {
        Transport car = null;

        switch (type){
            case ECONOMY -> car = new CarEconomy();
            case COMFORT -> car = new CarComfort();
            case BUSINESS -> car = new CarBusiness();
        }
        return car;
    }
}
