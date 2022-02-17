package com.tms.task.task9;

public class Program {

    public static void main(String[] args) {
        Person.displayCounter();
        Person tom = new Person();
        Person bob = new Person();
        tom.displayId();
        bob.displayId();

        System.out.println(Person.counter);

        Person.counter = 8;
        Person sam = new Person();
        sam.displayId();
        Person.displayCounter();
    }
}
