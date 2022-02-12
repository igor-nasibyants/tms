package com.tms.homework.han.task7;

public class BMW extends Car implements Driverable, Roarable {
    private boolean isFly;
    private int mile;
    private String name;

    public BMW(int wheels, int engine, String color, boolean isFly, int mile, String name) {
        super(wheels, engine, color);
        this.isFly = isFly;
        this.mile = mile;
        this.name = name;
    }

    private void fly() {
        if (isFly) {
            System.out.println(name + " (цвет: " + color + ", колес: " + wheels + ") - летит");
        } else {
            System.out.println(name + " (цвет: " + color + ", колес: " + wheels + ") - едет");
        }
    }

    public void drive() {
        for (int i = 1; i <= mile; i += 1) {
            if (isFly) {
                fly();
                roar();
                System.out.println("Машина пролетела " + i + " км \n");
            } else {
                fly();
                roar();
                System.out.println("Машина проехала " + i + " км \n");
            }
        }
    }

    @Override
    public void roar() {
        if (isFly) {
            System.out.println("Водитель кричит");
        } else {
            System.out.println("Водитель доволен");
        }
    }

    public String getName() {
        return name;
    }

    @Override
    public String saysDriver() {
        if (isFly) {
            return "Круто полетали \n";
        } else {
            return "Эх, полетать бы... \n";
        }
    }
}
