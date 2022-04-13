package com.tms.homework.han.task8.inheritance;

public class Animal {
    private int paws;
    private int teeth;
    private String sound;

    public Animal(int paws, int teeth, String sound) {
        this.paws = paws;
        this.teeth = teeth;
        this.sound = sound;
    }


    private void say() {
        System.out.println("Animal say's: " + sound);
    }
}
