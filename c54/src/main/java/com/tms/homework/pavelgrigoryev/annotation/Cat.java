package com.tms.homework.pavelgrigoryev.annotation;

@VeryImportant
public class Cat {
    @ImportantString
    String name;

    public Cat(String name) {
        this.name = name;
    }

    @RunImmediately(times = 3)
    public void meow() {
        System.out.println("Meow & Destroy");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
