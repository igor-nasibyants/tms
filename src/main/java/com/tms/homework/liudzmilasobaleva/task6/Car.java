package com.tms.homework.liudzmilasobaleva.task6;

class Engine {
    public void drive() {
        System.out.println("Двигатель работает");
    }
}


class Wheel {
    public void drive() {
        System.out.println("Колеса едут");
    }
}

class Car {
    Engine engine;
    Wheel[] wheels;

    Car() {
        this.engine = new Engine();
        this.wheels = new Wheel[]{new Wheel(), new Wheel(), new Wheel(), new Wheel()};
    }

    public void drive() {
        engine.drive();
        for (int i  = 0; i < this.wheels.length; i++) {
            this.wheels[i].drive();
        }
    }

    public static void main(String[] args) {
        Car c = new Car();
        c.drive();
    }
}