package com.tms.homework.han.creational.abstractfactory.factories;

import com.tms.homework.han.creational.abstractfactory.domain.Body;
import com.tms.homework.han.creational.abstractfactory.domain.IBody;
import com.tms.homework.han.creational.abstractfactory.domain.IProduct;
import com.tms.homework.han.creational.abstractfactory.domain.Plane;

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
