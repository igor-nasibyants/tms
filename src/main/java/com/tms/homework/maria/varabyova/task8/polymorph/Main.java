package com.tms.homework.maria.varabyova.task8.polymorph;

public class Main {
    public static void main(String args[]) {

        Transport transport1 = new Truck();
        Transport transport2 = new Train();

        transport1.voice();
        transport2.voice();
    }
}
