package com.tms.homework.han.patterns.creational.abstractfactory.factories;

import com.tms.homework.han.patterns.creational.abstractfactory.domain.Body;
import com.tms.homework.han.patterns.creational.abstractfactory.domain.IBody;
import com.tms.homework.han.patterns.creational.abstractfactory.domain.IProduct;
import com.tms.homework.han.patterns.creational.abstractfactory.domain.Plane;

public class PlaneFactory implements IFactory {
    @Override
    public IBody createBody() {
        return new Body();
    }

    @Override
    public IProduct releaseProduct() {
        return new Plane();
    }
}
