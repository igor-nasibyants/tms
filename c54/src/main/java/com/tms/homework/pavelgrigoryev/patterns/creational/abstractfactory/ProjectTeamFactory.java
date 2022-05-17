package com.tms.homework.pavelgrigoryev.patterns.creational.abstractfactory;

public interface ProjectTeamFactory {
    Developer getDeveloper();

    Tester getTester();

    ProjectManager getProjectManager();

}
