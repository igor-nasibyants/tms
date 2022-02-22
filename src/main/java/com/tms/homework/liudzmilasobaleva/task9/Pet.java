package com.tms.homework.liudzmilasobaleva.task9;

public class Pet extends Mammal {

    private String name;
    private int age;

    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Pet(String name) {

        this.name = name;
    }

    public Pet() {

    }

    @Override
    void move() {
        super.move();
        System.out.println("I run at home");
    }

    @Override
    public String toString() {
        return "Pet " + name + ", " + age + " year(s)";
    }
}