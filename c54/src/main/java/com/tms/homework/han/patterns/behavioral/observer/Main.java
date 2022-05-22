package com.tms.homework.han.patterns.behavioral.observer;

public class Main {
    public static void main(String[] args) {
        Product product = new Product("BMW-Audi - Han-Edition", 10000);
        HanWorkShop hanWorkShop = new HanWorkShop(product);
        TeslaWorkShop teslaWorkShop = new TeslaWorkShop(product);

        product.changePrice(5000);
    }
}
