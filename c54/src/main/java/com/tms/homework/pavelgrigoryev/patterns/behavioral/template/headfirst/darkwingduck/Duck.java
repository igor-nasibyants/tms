package com.tms.homework.pavelgrigoryev.patterns.behavioral.template.headfirst.darkwingduck;

public class Duck implements Comparable<Duck> {
    String name;
    int weight;

    public Duck(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Duck{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

    @Override
    public int compareTo(Duck otherDuck) {
        return Integer.compare(this.weight, otherDuck.weight);
    }
}
