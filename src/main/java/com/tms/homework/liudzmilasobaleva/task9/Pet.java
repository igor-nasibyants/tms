package com.tms.homework.liudzmilasobaleva.task9;

// final class, not to be extended
public final class Pet extends Mammal {

    private String name;
    private int age;

    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Pet(String name) {

        this.name = name;
    }

    public Pet() {

    }

    @Override
    void move() {
        super.move();
        System.out.println("I run at home");
    }

    // it's not an overriding methods, but hiding methods
    static void feedOnMilk() {                        // access static 'Mammal.eatMilk()' via class Mammal reference
        System.out.println("I feed on milk, I am a Pet");
    }

    @Override
    public String toString() {
        return "Pet " + name + ", " + age + " year(s)";
    }
}