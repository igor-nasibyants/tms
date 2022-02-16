package com.tms.homework.han.task8.encapsulation;

public class Animal {
    int paws;
    int teeth;
    String sound;

    public Animal(int paws, int teeth, String sound) {
        this.paws = paws;
        this.teeth = teeth;
        this.sound = sound;
    }


    public void say() {
        System.out.println("Animal say's: " + sound);
    }
}
