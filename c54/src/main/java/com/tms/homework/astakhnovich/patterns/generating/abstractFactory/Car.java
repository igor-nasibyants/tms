package by.astakhnovich.patterns.generating.abstractFactory;

public class Car implements Transport {
    String name;

    public Car(String name) {
        this.name = name;
    }

    @Override
    public void move() {
        System.out.println("я" + name + ", везу по дороге");
    }
}
