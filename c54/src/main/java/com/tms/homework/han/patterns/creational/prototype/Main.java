package com.tms.homework.han.patterns.creational.prototype;

public class Main {
    public static void main(String[] args) {
        Car carDonor = new BMW();
        carDonor.setName("Audi");

        Car carClone = carDonor.clone();

        System.out.println(carDonor.getName());
        System.out.println(carClone.getName());
    }
}
