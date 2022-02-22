package com.tms.homework.liudzmilasobaleva.task7;

public class Pet extends Mammal {

    public PetsType PetsType;
    private String name;
    private int age;

    public Pet(String name, int age) {

        this.name = name;
        this.age = age;
    }

    public Pet() {

    }

    @Override
    public void run() {
        super.run();
    }

    @Override
    public void eatMilk() {
        super.eatMilk();

    }

    @Override
    public String toString() {
        return "Pet " + name + " " + age;
    }


}