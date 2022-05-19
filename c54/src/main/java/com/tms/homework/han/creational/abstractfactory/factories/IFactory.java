package com.tms.homework.han.creational.abstractfactory.factories;

import com.tms.homework.han.creational.abstractfactory.domain.IBody;
import com.tms.homework.han.creational.abstractfactory.domain.IProduct;

public interface IFactory {
   IBody createBody();
   IProduct releaseProduct();
}
