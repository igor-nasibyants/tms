package com.tms.homework.han.task7;

public class Main {
    public static void main(String[] args) {
        BMW bmw = new BMW(2, 2, "Black", false, 10, "BMW");
        BMW audi = new BMW(4, 1, "Black", true, 4, "Audi");
        bmw.drive();
        System.out.println("========================= \n");
        audi.drive();
        System.out.print("Водитель " + bmw.getName() + " говорит: " + bmw.saysDriver());
        System.out.print("Водитель " + audi.getName() + " говорит: " + audi.saysDriver());
    }
}
