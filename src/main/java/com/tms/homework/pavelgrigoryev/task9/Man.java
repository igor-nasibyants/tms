package com.tms.homework.pavelgrigoryev.task9;

import static java.lang.System.out;

public class Man extends Person {
    public Man(String name, int age, String speciality) {
        super(name, age, speciality);
    }

    @Override
    public void work() {
        out.print("Мужчина " + getName() + " умножает два числа : ");
        out.println(mul(5, 6));
        out.print("Мужчина " + getName() + " умножает три числа : ");
        out.println(mul(7, 2, 6));
    }

    @Override
    public void talk() {
        out.println("Работа и труд всё перетрут!");
    }

    public int mul(int a, int b) {
        return a * b;
    }

    public int mul(int a, int b, int c) {
        return a * b * c;
    }
}
