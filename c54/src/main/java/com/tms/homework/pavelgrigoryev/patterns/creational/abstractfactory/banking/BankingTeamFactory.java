package com.tms.homework.pavelgrigoryev.patterns.creational.abstractfactory.banking;

import com.tms.homework.pavelgrigoryev.patterns.creational.abstractfactory.Developer;
import com.tms.homework.pavelgrigoryev.patterns.creational.abstractfactory.ProjectManager;
import com.tms.homework.pavelgrigoryev.patterns.creational.abstractfactory.ProjectTeamFactory;
import com.tms.homework.pavelgrigoryev.patterns.creational.abstractfactory.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new BankingPM();
    }
}
