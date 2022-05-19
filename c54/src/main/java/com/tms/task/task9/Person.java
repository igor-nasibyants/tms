package com.tms.task.task9;

public class Person {
    static int counter = 1;

    static {
        counter = 105;
    }

    private final int id;

    Person() {
        id = counter;
        counter += 1;
    }

    public static void displayCounter() {
        System.out.println("counter: " + counter);
    }

    public void displayId() {
        System.out.println("id: " + id);
    }
}
