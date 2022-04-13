package com.tms.homework.pavelgrigoryev.task13.tree;

public class Animal implements Comparable<Animal>{
    private final String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Animal o) {
        return name.length() - o.getName().length();
    }
}
