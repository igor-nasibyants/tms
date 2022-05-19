package com.tms.homework.astakhnovich.patterns;

public class DogFactory implements AbstractFactory{
    Dog dog;

    @Override
    public Essence create() {
        return dog = new Dog(20, 20, 4);
    }
}
