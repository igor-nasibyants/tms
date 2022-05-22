package com.tms.homework.pavelgrigoryev.patterns.behavioral.strategy;

public class Sleeping implements Activity {
    @Override
    public void justDoIt() {
        System.out.println("Sleeping...");
    }
}
