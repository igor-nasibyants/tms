package com.tms.homework.nikitaelenski.task30.generative.factorymethod;

public class JavaDeveloperFactory implements DeveloperFactory{
    @Override
    public Developer CreatDeveloper() {
        return new JavaDeveloper();
    }
}
