package com.tms.homework.han.task18.hero;

abstract class SuperHero extends Human {
    private final String superPower;
    private final Integer speed;

    public SuperHero(String name, Integer age, Integer id, String superPower, Integer speed) {
        super(name, age, id);
        this.superPower = superPower;
        this.speed = speed;
    }

    @Override
    public void say() {
        System.out.println("Hello, I'm super hero");
    }

    public String getSuperPower() {
        return superPower;
    }

    public int getSpeed() {
        return speed;
    }
}
