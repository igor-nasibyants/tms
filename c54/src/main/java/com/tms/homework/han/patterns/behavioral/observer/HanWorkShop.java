package com.tms.homework.han.patterns.behavioral.observer;

public class HanWorkShop implements Observer {
    private Observable product;

    public HanWorkShop(Observable observable) {
        product = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(double price) {
        System.out.println("Для HAN: Уважаемая мастерская имени Han, покупка завершена по цене - " + price);
        product.removeObserver((this));
    }
}
