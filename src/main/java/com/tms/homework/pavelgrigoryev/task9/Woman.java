package com.tms.homework.pavelgrigoryev.task9;

import static java.lang.System.out;

public class Woman extends Person {
    public Woman(String name, int age, String speciality) {
        super(name, age, speciality);
    }

    @Override
    public void work() {
        out.print("Женщина " + getName() + " вычесляет факториал числа : ");
        out.println(getFactorial(5));
    }

    @Override
    public void talk() {
        out.println("Работа не волк, в лес не убежит!");
    }

    public static int getFactorial(int f) {
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result = result * i;
        }
        return result;
    }
}
