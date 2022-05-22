package com.tms.homework.han.patterns.behavioral.observer;

public class TeslaWorkShop implements Observer {
    private Observable observable;

    public TeslaWorkShop(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(double price) {
        System.out.println("Для TESLA: Отправляю то, что не можете себе позволить по цене - " + price);
    }
}
