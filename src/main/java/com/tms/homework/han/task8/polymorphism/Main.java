package com.tms.homework.han.task8.polymorphism;

public class Main {
    public static void main(String[] args) {
        Cat barsik = new Cat();
        Animal ant = new Animal();
        barsik.say();
        barsik.say("I'm not cat");
        ant.say();
    }
}
