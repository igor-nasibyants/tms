package com.tms.homework.astakhnovich.patterns.generating.factory_method;

public class TaxiCarFactory {
    public Transport createTransport (CarType type) {
        Transport car = null;

        switch (type){
            case ECONOMY -> car = new EconomyTaxiCar();
            case COMFORT -> car = new ComfortTaxiCar();
            case BUSINESS -> car = new BusinessTaxiCar();
        }
        return car;
    }
}
