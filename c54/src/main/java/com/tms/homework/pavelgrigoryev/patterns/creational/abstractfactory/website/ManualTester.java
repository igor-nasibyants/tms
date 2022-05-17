package com.tms.homework.pavelgrigoryev.patterns.creational.abstractfactory.website;

import com.tms.homework.pavelgrigoryev.patterns.creational.abstractfactory.Tester;

public class ManualTester implements Tester {
    @Override
    public void testCode() {
        System.out.println("Manual tester tests website...");
    }
}
