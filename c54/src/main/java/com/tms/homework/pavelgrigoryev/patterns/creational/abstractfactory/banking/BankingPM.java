package com.tms.homework.pavelgrigoryev.patterns.creational.abstractfactory.banking;

import com.tms.homework.pavelgrigoryev.patterns.creational.abstractfactory.ProjectManager;

public class BankingPM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Banking PM manages banking project...");
    }
}
