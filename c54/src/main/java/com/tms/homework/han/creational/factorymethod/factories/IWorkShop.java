package com.tms.homework.han.creational.factorymethod.factories;

import com.tms.homework.han.creational.factorymethod.domain.IProduction;

public interface IWorkShop {
    IProduction create();
}
