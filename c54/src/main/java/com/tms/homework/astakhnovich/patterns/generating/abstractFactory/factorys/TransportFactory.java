package com.tms.homework.astakhnovich.patterns.generating.abstractFactory.factorys;


import com.tms.homework.astakhnovich.patterns.generating.abstractFactory.transport.TaxiType;
import com.tms.homework.astakhnovich.patterns.generating.abstractFactory.transport.Transport;

public interface TransportFactory {
    Transport createTransport (TaxiType type);
}