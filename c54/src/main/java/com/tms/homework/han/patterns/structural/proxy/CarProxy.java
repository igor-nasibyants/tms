package com.tms.homework.han.patterns.structural.proxy;

import java.util.HashMap;
import java.util.Map;

public class CarProxy implements BuyCar {
    private BuyCar buyCar;
    private Map<String, String> haveAuto;

    public CarProxy(BuyCar buyCar) {
        this.buyCar = buyCar;
        haveAuto = new HashMap<>();

    }

    @Override
    public String buyNewCar(String carName) {
        String page;
        if (haveAuto.containsKey(carName)) {
            page = "У вас уже есть машина с названием " + carName + "!";
        } else {
            page = buyCar.buyNewCar(carName);
            haveAuto.put(carName, page);
        }
        return page;
    }
}
