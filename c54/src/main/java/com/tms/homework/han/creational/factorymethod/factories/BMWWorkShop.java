package com.tms.homework.han.creational.factorymethod.factories;

import com.tms.homework.han.creational.factorymethod.domain.BMW;

public class BMWWorkShop implements IWorkShop<BMW>{
    @Override
    public BMW create() {
        return new BMW();
    }
}
