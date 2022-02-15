package com.tms.homework.liudzmilasobaleva.task7;

public class Mammal extends Animal {

    private int age;

    public Mammal(int age) {
        this.age = age;
    }

    @Override
    public void run() {
        super.run();
    }

    public void eatMilk() {
        System.out.println("I eat milk");

    }
}