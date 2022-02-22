package com.tms.homework.liudzmilasobaleva.task9;

public class Mammal extends Animal {

    private int age;

    public Mammal(int age) {

        this.age = age;
    }

    public Mammal() {

    }

    static void feedOnMilk() {                        // access static 'Mammal.eatMilk()' via class Mammal reference
        System.out.println("I feed on milk");
    }

    @Override
    void move() {
        System.out.println("I can run");

    }

    @Override
    void eat() {                                     // Overriding
        System.out.println("I eat something");
    }

    void eat(String meal) {                          // Overloading
        System.out.println("I prefer " + meal);
    }

    @Override
    public String toString() {
        return "Mammal, " + age + " year(s)";
    }
}