package com.tms.homework.han.patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Product implements Observable{

    private List<Observer> observers;
    private String nameCar;

    private double price;

    public Product(String nameCar, double price) {
        this.nameCar = nameCar;
        this.price = price;
        observers = new ArrayList<>();
    }

    void changePrice(double price) {
        this.price = price;
        updateNotify();
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void updateNotify() {
        Arrays.stream(observers.toArray()).forEach(o -> ((Observer) o).update(price));
    }
}
