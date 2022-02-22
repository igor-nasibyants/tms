package com.tms.homework.pavelgrigoryev.task6;

public class Tank {
    private String make;
    private String model;
    private int year;
    private String color;
    private double price;

    public Tank(String make, String model, int year, String color, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    void drive() {
        System.out.println("You drive the tank " + getMake() + " " + getModel());
    }

    void brake() {
        System.out.println("You step on the brakes " + getMake() + " " + getModel());
    }

    void fire() {
        System.out.println("You shoot from the tank " + getMake() + " " + getModel());
    }
}
