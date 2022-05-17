package com.tms.homework.pavelgrigoryev.patterns.creational.abstractfactory.website;

import com.tms.homework.pavelgrigoryev.patterns.creational.abstractfactory.Developer;
import com.tms.homework.pavelgrigoryev.patterns.creational.abstractfactory.ProjectManager;
import com.tms.homework.pavelgrigoryev.patterns.creational.abstractfactory.ProjectTeamFactory;
import com.tms.homework.pavelgrigoryev.patterns.creational.abstractfactory.Tester;

public class WebsiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new WebsitePM();
    }
}
