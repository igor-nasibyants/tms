package com.tms.homework.pavelgrigoryev.patterns.structural.composite;

public class Project {
    public static void main(String[] args) {
        Team team = new Team();

        Developer firstJavaDeveloper = new JavaDeveloper();
        Developer secondJavaDeveloper = new JavaDeveloper();
        Developer cppDeveloper = new CppDeveloper();

        team.addDeveloper(firstJavaDeveloper);
        team.addDeveloper(secondJavaDeveloper);
        team.removeDeveloper(firstJavaDeveloper);
        team.addDeveloper(cppDeveloper);

        team.createProject();
    }
}
