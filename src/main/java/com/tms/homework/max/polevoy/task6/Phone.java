package com.tms.homework.max.polevoy.task6;

public class Phone {
    String model;
    String year;
    String number;
    int price;


    void receiveCall(String name) {
        System.out.println("Calling " + name);
    }
    String getNumber() {
        return number;
    }
}
