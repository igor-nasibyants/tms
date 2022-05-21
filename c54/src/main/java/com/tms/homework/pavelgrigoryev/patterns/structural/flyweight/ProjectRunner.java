package com.tms.homework.pavelgrigoryev.patterns.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class ProjectRunner {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = new DeveloperFactory();

        List<Developer> developers = new ArrayList<>();

        developers.add(developerFactory.getDeveloperBySpecialty("kotlin"));
        developers.add(developerFactory.getDeveloperBySpecialty("kotlin"));

        developers.add(developerFactory.getDeveloperBySpecialty("python"));
        developers.add(developerFactory.getDeveloperBySpecialty("python"));

        developers.forEach(Developer::writeCode);
    }
}
