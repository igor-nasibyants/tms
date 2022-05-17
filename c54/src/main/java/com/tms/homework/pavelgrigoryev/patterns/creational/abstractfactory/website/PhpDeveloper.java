package com.tms.homework.pavelgrigoryev.patterns.creational.abstractfactory.website;

import com.tms.homework.pavelgrigoryev.patterns.creational.abstractfactory.Developer;

public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Php developer writes php code...");
    }
}
