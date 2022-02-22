package com.tms.task.task8.polymorphism;

public class Sparrow extends Bird {
    @Override
    public void sound() {
        System.out.println("chip");
    }

    // Method Overloading - compile-time polymorphism
    public void sound(String voice) {
        System.out.println(voice);
    }

    public void sound(String voice, Integer n) {
        for (int i = 0; i < n; i++) {
            sound(voice);
        }
    }
}
