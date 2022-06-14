package com.tms.homework.pavelgrigoryev.patterns.behavioral.command.headfirst.ceilingfan;

public class CeilingFan {
    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    String room;
    int speed;

    public CeilingFan(String room) {
        this.room = room;
        speed = OFF;
    }

    public void high() {
        System.out.println("Вяликая хуткасть! у " + room);
        speed = HIGH;
    }

    public void medium() {
        System.out.println("Сярэдняя хуткасть! у " + room);
        speed = MEDIUM;
    }

    public void low() {
        System.out.println("Лоу хуткасть! у " + room);
        speed = LOW;
    }

    public void on() {
        System.out.println("Вентылятор паталочны уключан! у " + room);
        speed = LOW;
    }

    public void off() {
        System.out.println("Вентылятор паталочны выключан! у " + room);
        speed = OFF;
    }

    public int getSpeed() {
        return speed;
    }
}
