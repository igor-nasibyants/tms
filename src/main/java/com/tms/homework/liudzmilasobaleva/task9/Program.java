package com.tms.homework.liudzmilasobaleva.task9;

public class Program {

    public static void main(String[] args) {

        Pet ksu = new Pet("Ksu", 13);
        System.out.println(ksu.toString());
        ksu.move();
        Mammal.feedOnMilk();
        ksu.eat();
        ksu.eat("fish");

        Mammal m = new Mammal(2);
        System.out.println(m.toString());
        m.move();
        Mammal.feedOnMilk();
        m.eat();
        m.eat("carrot");
    }
}