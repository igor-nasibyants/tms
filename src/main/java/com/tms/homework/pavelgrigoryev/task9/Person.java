package com.tms.homework.pavelgrigoryev.task9;

public abstract class Person {
    private final String name;
    private  String model;
    private  int age;
    private final String speciality;

    public Person(String name, int age, String speciality) {
        this.name = name;
        this.age = age;
        this.speciality = speciality;
    }

    public Person(String name, String model, String speciality) {
        this.name = name;
        this.model = model;
        this.speciality = speciality;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public int getAge() {
        return age;
    }

    public String getSpeciality() {
        return speciality;
    }


    public abstract void work();

    public abstract void talk();
}
