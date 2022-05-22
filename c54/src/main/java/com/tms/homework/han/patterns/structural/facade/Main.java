package com.tms.homework.han.patterns.structural.facade;

public class Main {
    public static void main(String[] args) {
        MarketPlace marketPlace = new MarketPlace();
        marketPlace.productReceive();
        System.out.println();

        marketPlace.productRelease();
    }
}
