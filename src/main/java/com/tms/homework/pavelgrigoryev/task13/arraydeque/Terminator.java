package com.tms.homework.pavelgrigoryev.task13.arraydeque;

public class Terminator {
    private final String name;
    private final String model;
    private final int mark;

    public Terminator(String name, String model, int mark) {
        this.name = name;
        this.model = model;
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Terminator{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", mark=" + mark +
                '}';
    }
}
