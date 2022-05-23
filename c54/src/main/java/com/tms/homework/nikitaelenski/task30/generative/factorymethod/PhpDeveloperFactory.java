package com.tms.homework.nikitaelenski.task30.generative.factorymethod;

public class PhpDeveloperFactory implements DeveloperFactory{
    @Override
    public Developer CreatDeveloper() {
        return new PhpDeveloper();
    }
}
