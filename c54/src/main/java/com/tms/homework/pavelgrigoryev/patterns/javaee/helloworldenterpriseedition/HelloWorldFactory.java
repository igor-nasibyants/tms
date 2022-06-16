package com.tms.homework.pavelgrigoryev.patterns.javaee.helloworldenterpriseedition;

public class HelloWorldFactory {
    private static final HelloWorldFactory instance = new HelloWorldFactory();

    public static HelloWorldFactory getInstance() {
        return instance;
    }

    public IHelloWorld createHelloWorld() {
        return new HelloWorldImplementation();
    }
}
