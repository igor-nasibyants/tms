package com.tms.homework.pavelgrigoryev.task9;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        Man man = new Man("Алексей", 37, "Умножитель до 3ёх чисел");
        separator();
        out.println(man.getName() + " " + man.getAge() + " - " + man.getSpeciality());
        man.work();
        man.talk();
        man.clap();
        separator();

        Woman woman = new Woman("Вера", 42, "Вычеслитель факториала числа");
        out.println(woman.getName() + " " + woman.getAge() + " - " + woman.getSpeciality());
        woman.work();
        woman.talk();
        woman.clap();
        separator();

        Android android = new Android("Isak", "Tesla bot t-3010", "Работарговец");
        out.println(android.getName() + " - " + android.getModel() + " - " + android.getSpeciality());
        android.work();
        android.talk();
        android.clap();
        separator();
    }

    private static void separator() {
        out.println("=================================================================");
    }
}
