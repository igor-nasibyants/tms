package com.tms.homework.han.task9;

abstract class Man {

    private final String name;
    private final int power;
    private final int speed;

    public Man(int power, int speed, String name) {
        this.power = power;
        this.speed = speed;
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    public int getSpeed() {
        return speed;
    }

    public String getName() {
        return name;
    }


    public Man() {
        this(5, 10, "Никто");
    }

    public String go() {
        return "Передвигается со скоростью: " + speed;
    }

    public String lifts() {
        return "Поднимает тяжести с силой: " + power;
    }
}
