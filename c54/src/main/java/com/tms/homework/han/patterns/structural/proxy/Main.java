package com.tms.homework.han.patterns.structural.proxy;

public class Main {
    public static void main(String[] args) {
        BuyCar buyCar = new CarProxy(new Car());
        System.out.println(buyCar.buyNewCar("BMW-Audi"));
        System.out.println(buyCar.buyNewCar("Audi-BMW"));
        System.out.println(buyCar.buyNewCar("BMW-Audi"));
    }
}
