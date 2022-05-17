package com.tms.homework.pavelgrigoryev.patterns.creational.factorymethod;

public class PhpDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new PhpDeveloper();
    }
}
