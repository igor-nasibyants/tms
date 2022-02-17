package com.tms.task.task9;

public class Person {
    private int id;
    static int counter = 1;

    static {
        counter = 105;
    }

    Person() {
        id = counter;
        counter += 1;
    }

    public void displayId() {
        System.out.println("id: " + id);
    }

    public static void displayCounter() {
        System.out.println("counter: " + counter);
    }
}
