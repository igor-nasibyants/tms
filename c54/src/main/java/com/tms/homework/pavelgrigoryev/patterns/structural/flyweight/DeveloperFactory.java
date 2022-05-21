package com.tms.homework.pavelgrigoryev.patterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class DeveloperFactory {
    private static final Map<String, Developer> developers = new HashMap<>();

    public Developer getDeveloperBySpecialty(String specialty) {
        Developer developer = developers.get(specialty);

        if (developer == null) {
            switch (specialty) {
                case "kotlin" -> {
                    System.out.println("Hiring Kotlin developer...");
                    developer = new KotlinDeveloper();
                }
                case "python" -> {
                    System.out.println("Hiring Python developer...");
                    developer = new PythonDeveloper();
                }
            }
            developers.put(specialty, developer);
        }
        return developer;
    }
}
