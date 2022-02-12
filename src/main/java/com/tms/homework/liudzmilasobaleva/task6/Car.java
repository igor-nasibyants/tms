package com.tms.homework.liudzmilasobaleva.task6;

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
        Car volvo = new Car();
        volvo.drive();
    }
}