package com.tms.homework.han.patterns.creational.abstractfactory.factories;

import com.tms.homework.han.creational.abstractfactory.domain.*;
import com.tms.homework.han.patterns.creational.abstractfactory.domain.Body;
import com.tms.homework.han.patterns.creational.abstractfactory.domain.Car;
import com.tms.homework.han.patterns.creational.abstractfactory.domain.IBody;
import com.tms.homework.han.patterns.creational.abstractfactory.domain.IProduct;

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
