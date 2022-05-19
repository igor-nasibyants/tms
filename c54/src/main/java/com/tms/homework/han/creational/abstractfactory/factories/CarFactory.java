package com.tms.homework.han.creational.abstractfactory.factories;

import com.tms.homework.han.creational.abstractfactory.domain.*;

public class CarFactory implements IFactory {

    @Override
    public IBody createBody() {
        return new Body();
    }

    @Override
    public IProduct releaseProduct() {
        return new Car();
    }

}
