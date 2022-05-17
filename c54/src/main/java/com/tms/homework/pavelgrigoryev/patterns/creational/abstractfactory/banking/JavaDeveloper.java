package com.tms.homework.pavelgrigoryev.patterns.creational.abstractfactory.banking;

import com.tms.homework.pavelgrigoryev.patterns.creational.abstractfactory.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java developer writes Java Code ...");
    }
}
