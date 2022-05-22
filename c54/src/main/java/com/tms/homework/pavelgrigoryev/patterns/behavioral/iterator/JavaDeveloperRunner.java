package com.tms.homework.pavelgrigoryev.patterns.behavioral.iterator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JavaDeveloperRunner {
    public static void main(String[] args) {
        List<String> skills = new ArrayList<>();
        Collections.addAll(skills, "Java", "Spring", "Maven", "Gradle", "MySQL", "Kotlin");

        JavaDeveloper javaDeveloper = new JavaDeveloper("Pavel Grigoryev", skills);

        Iterator iterator = javaDeveloper.getIterator();
        System.out.println("Developer: " + javaDeveloper.getName());
        System.out.print("Skills: ");

        skills.forEach(x -> {
            while (iterator.hasNext()) {
                System.out.print(iterator.next().toString() + " ");
            }
        });
    }
}
