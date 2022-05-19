package com.tms.homework.astakhnovich.patterns;

import com.tms.task.task8.inheritance.hybrid.D;

public class Main {


    public static void main(String[] args) {
        Essence monkey;
        Essence dog;

        DogFactory dogFactory = new DogFactory();
        dog = dogFactory.create();

        MonkeyFactory monkeyFactory = new MonkeyFactory();

        monkey = monkeyFactory.create();
    }
}
