package com.tms.homework.han.patterns.creational.abstractfactory.factories;

import com.tms.homework.han.patterns.creational.abstractfactory.domain.IBody;
import com.tms.homework.han.patterns.creational.abstractfactory.domain.IProduct;

public interface IFactory {
   IBody createBody();
   IProduct releaseProduct();
}
