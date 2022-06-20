package by.astakhnovich.patterns.generating.abstractFactory;

public class Helicopter implements Transport {
    String name;

    public Helicopter(String name) {
        this.name = name;
    }

    @Override
    public void move() {
        System.out.println("я" + name + ", везу по воздуху");
    }
}
