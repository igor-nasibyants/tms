package com.tms.homework.han.oopTest;

public class Main {
    static People people = new People(23, "Nikita", 173);
    static Man man = new Man(48, "Chel", 185, "asaa", 11111);
    static Boss boss = new Boss(2, "BOSS", 200, "BOSSES", 99999999, "MONEY");
    static People[] people1 = {people, man, boss};

    public static void massPrint(People[] peoples) {
        for (People person : peoples) {
            person.print();
        }
    }

    public static void main(String[] args) {
        people.print();
        man.print();
        boss.print();
        System.out.println();
        massPrint(people1);
    }
}