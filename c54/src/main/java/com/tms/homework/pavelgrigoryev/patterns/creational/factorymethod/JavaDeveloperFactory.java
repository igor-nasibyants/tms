package com.tms.homework.pavelgrigoryev.patterns.creational.factorymethod;

public class JavaDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }
}
