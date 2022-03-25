package com.tms.homework.han.task18.hero;

public class IronMan extends SuperHero implements Flyable {

    public IronMan(String name, Integer age, Integer id, String superPower, int speed) {
        super(name, age, id, superPower, speed);
    }

    @Override
    public void fly() {
        System.out.println();
    }
}
