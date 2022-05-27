package com.tms.homework.pavelgrigoryev.task33;

import java.util.ArrayList;
import java.util.List;

public class GoblinRunner {
    public static void main(String[] args) throws CloneNotSupportedException {
        Goblin bmw = new Goblin("Georgy", "Black", 70, 3.05, new ArrayList<>(List.of(
                new Weapon("Sword", 45.5),
                new Weapon("Axe", 55.9),
                new Weapon("Beer", 6.1)
        )));
        Goblin audi = new Goblin("Georgy", "Black", 70, 3.05, new ArrayList<>(List.of(
                new Weapon("Sword", 45.5),
                new Weapon("Axe", 55.9),
                new Weapon("Beer", 6.1)
        )));
        Goblin mercedes = new Goblin("Georgy", "Black", 70, 3.05, new ArrayList<>(List.of(
                new Weapon("Sword", 45.5),
                new Weapon("Axe", 55.9),
                new Weapon("Beer", 6.1)
        )));

        System.out.println(bmw + "\n" + audi + "\n" + mercedes + "\n");

        System.out.println("bmw.equals(audi) " + bmw.equals(audi));
        System.out.println("bmw.equals(mercedes) " + bmw.equals(mercedes));
        System.out.println("mercedes.equals(audi) " + mercedes.equals(audi));

        Weapon cola = new Weapon("Bow", 15.6);
        Weapon sprite = new Weapon("Bow", 15.6);

        System.out.println("\n" + cola + "\n" + sprite + "\n");

        System.out.println("cola.equals(sprite) " + cola.equals(sprite) + "\n");

        Goblin tesla = audi.clone();

        System.out.println("Clone of audi -> \n" + tesla + "\n");

        System.out.println("audi.equals(tesla) " + audi.equals(tesla));
        System.out.println("bmw.equals(tesla) " + bmw.equals(tesla));
        System.out.println("mercedes.equals(tesla) " + mercedes.equals(tesla));
    }
}
