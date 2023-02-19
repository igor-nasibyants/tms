package com.tms.homework.artsiom.vladykouski.task18.json;

import java.util.List;

public class Fruit {
    private List <String> fruits;

    public Fruit(List<String> fruits) {
        this.fruits = fruits;
    }

    public List<String> getFruits() {
        return fruits;
    }

    public void setFruits(List<String> fruits) {
        this.fruits = fruits;
    }
}
