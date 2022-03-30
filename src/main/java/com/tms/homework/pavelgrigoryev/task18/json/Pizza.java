package com.tms.homework.pavelgrigoryev.task18.json;

public class Pizza {
    private final String name;
    private final int size;

    public Pizza(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", size=" + size +
                '}';
    }
}
