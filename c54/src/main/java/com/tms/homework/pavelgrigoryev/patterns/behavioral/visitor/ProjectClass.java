package com.tms.homework.pavelgrigoryev.patterns.behavioral.visitor;

public class ProjectClass implements ProjectElement {
    @Override
    public void beWritten(Developer developer) {
        developer.create(this);
    }
}
