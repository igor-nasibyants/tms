package com.tms.homework.han.patterns.creational.abstractfactory;

import com.tms.homework.han.patterns.creational.abstractfactory.domain.IBody;
import com.tms.homework.han.patterns.creational.abstractfactory.domain.IProduct;
import com.tms.homework.han.patterns.creational.abstractfactory.factories.CarFactory;
import com.tms.homework.han.patterns.creational.abstractfactory.factories.IFactory;
import com.tms.homework.han.patterns.creational.abstractfactory.factories.PlaneFactory;

public class Main {
    public static void main(String[] args) {
        IFactory factoryCar = new CarFactory();
        IBody bodyCar = factoryCar.createBody();
        IProduct car = factoryCar.releaseProduct();
        car.realise(bodyCar);

        IFactory factoryPlane = new PlaneFactory();
        IBody bodyPlane = factoryPlane.createBody();
        IProduct plane = factoryPlane.releaseProduct();
        plane.realise(bodyPlane);
    }
}
