package com.tms.homework.liudzmilasobaleva.task7;

public class Pet extends Mammal {
    public PetsType PetsType;
    private String name;

    public Pet(String name, int age) {
        super(age);
        this.name = name;
    }

    @Override
    public void run() {
        super.run();
    }

    @Override
    public void eatMilk() {
        super.eatMilk();

    }

}