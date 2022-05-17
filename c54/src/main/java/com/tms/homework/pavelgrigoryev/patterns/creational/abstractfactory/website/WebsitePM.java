package com.tms.homework.pavelgrigoryev.patterns.creational.abstractfactory.website;

import com.tms.homework.pavelgrigoryev.patterns.creational.abstractfactory.ProjectManager;

public class WebsitePM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Website PM manages Website project...");
    }
}
