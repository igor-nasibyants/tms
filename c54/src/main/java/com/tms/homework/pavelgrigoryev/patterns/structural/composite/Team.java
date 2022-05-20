package com.tms.homework.pavelgrigoryev.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private final List<Developer> developers = new ArrayList<>();

    public void addDeveloper(Developer developer) {
        developers.add(developer);
    }

    public void removeDeveloper(Developer developer) {
        developers.remove(developer);
    }

    public void createProject() {
        System.out.println("\nTeam creates project...\n");
        developers.forEach(Developer::writeCode);
    }
}
