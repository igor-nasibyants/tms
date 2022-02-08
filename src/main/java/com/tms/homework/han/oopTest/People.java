package com.tms.homework.han.oopTest;

class People {
    int age;
    String name;
    int height;

    public void print() {
        System.out.println("Name: " + name + "Age: " + age + "Height: " + height);
    }

    public People(int age, String name, int height) {
        this.age = age;
        this.name = name;
        this.height = height;
    }

}

