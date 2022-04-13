package com.tms.homework.han.task18.hero;

public class SpiderMan extends SuperHero implements Flyable {

    public SpiderMan(String name, Integer age, Integer id, String superPower, int speed) {
        super(name, age,id, superPower, speed);
    }

    @Override
    public void fly() {
        System.out.println("Flying on the web");
    }
}
