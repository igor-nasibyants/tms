package com.tms.homework.pavelgrigoryev.patterns.behavioral.template.headfirst.darkwingduck;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DuckSortTestDrive {
    public static void main(String[] args) {
        List<Duck> ducks = new ArrayList<>();
        Collections.addAll(ducks,
                new Duck("Daffy", 8),
                new Duck("Dewey", 2),
                new Duck("Howard", 7),
                new Duck("Louie", 2),
                new Duck("Donald", 10),
                new Duck("Huey", 2)
        );

        System.out.println("Before sorting: ");
        display(ducks);

        ducks.sort(Duck::compareTo);

        System.out.println("\nAfter sorting: ");
        display(ducks);
    }

    public static void display(List<Duck> ducks) {
        ducks.forEach(System.out::println);
    }
}
