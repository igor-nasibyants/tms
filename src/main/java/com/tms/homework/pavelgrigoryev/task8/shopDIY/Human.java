package com.tms.homework.pavelgrigoryev.task8.shopDIY;

public abstract class Human {
    private final String name;
    private final int age;
    private String mood;
    private String efficiency;

    public Human(String name, int age, String mood, String efficiency) {
        this.name = name;
        this.age = age;
        this.mood = mood;
        this.efficiency = efficiency;
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getMood() {
        return mood;
    }

    public String getEfficiency() {
        return efficiency;
    }
    public abstract void lunch();
}
