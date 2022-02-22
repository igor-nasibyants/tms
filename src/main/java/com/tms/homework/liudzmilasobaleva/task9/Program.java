package com.tms.homework.liudzmilasobaleva.task9;

public class Program {

    public static void main(String[] args) {

        Pet ksu = new Pet("Ksu", 13);
        System.out.println(ksu.toString());
        ksu.move(); // we'll get "I can run" "I run at home" (overriding)
        ksu.feedOnMilk(); // we'll get "I feed on milk, I am a Pet"
        ksu.eat();
        ksu.eat("fish");

        Mammal m = new Pet ("Asya", 1);
        System.out.println(m.toString());
        m.move(); // we'll get "I can run" "I run at home" (overriding)
        m.feedOnMilk(); // we'll get "I feed on milk" (hiding methods)
        m.eat();
        m.eat("carrot");
    }
}