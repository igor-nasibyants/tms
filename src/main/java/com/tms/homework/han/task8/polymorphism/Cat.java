package com.tms.homework.han.task8.polymorphism;

public class Cat extends Animal {
    @Override
    public void say() {
        System.out.println("I'm a cat");
    }

    public void say(String sound) {
        System.out.println(sound);
    }
}
