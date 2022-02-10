package com.tms.homework.han.task6;

public class Car {
    private int wheels;
    private int engine;
    private String color;
    private Car[] aa;

    public Car(Car[] aa) {
        this.aa = aa;
    }


    public Car(int wheels, int engine, String color) {
        this.wheels = wheels;
        this.engine = engine;
        this.color = color;
    }

    public Car(int engine, String color) {
        this.engine = engine;
        this.color = color;
        this.wheels = 0;
    }

    public Car(int wheels, int engine) {
        this.wheels = wheels;
        this.engine = engine;
        this.color = "";
    }

    public Car() {
        this(4, 1, "red");
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getEngine() {
        return engine;
    }

    public void setEngine(int engine) {
        this.engine = engine;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String drive() {
        return "Едет";
    }

    public String fly() {
        if (this.wheels == 0) {
            return "Летает";
        } else if (this.wheels == 4 && this.engine == 1) {
            return drive();
        } else if (this.engine > 1) {
            return "Супер-машина";
        } else {
            return "Непонятно";
        }
    }

    public void sa() {
        for (int i = 0; i < aa.length; i++) {
            System.out.println(drive());
        }
    }

}
