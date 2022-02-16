package com.tms.homework.liudzmilasobaleva.task8.inheritance;

public class Sedan extends EClass {
    @Override
    public void drive() {
        super.drive();
    }

    public static void main(String[] args) {
        Car volvoS80 = new Car();
        volvoS80.drive();
    }
}
