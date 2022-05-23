package com.tms.homework.nikitaelenski.task30.generative.factorymethod;

public class CppDeveloperFActory implements DeveloperFactory{
    @Override
    public Developer CreatDeveloper() {
        return new CppDeveloper();
    }
}
