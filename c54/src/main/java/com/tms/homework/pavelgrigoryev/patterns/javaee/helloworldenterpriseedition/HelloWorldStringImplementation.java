package com.tms.homework.pavelgrigoryev.patterns.javaee.helloworldenterpriseedition;

public class HelloWorldStringImplementation implements IHelloWorldString {
    @Override
    public HelloWorldString getHelloWorldString() {
        StringFactory factory = StringFactory.getInstance();
        return factory.createHelloWorldString("Hello, World!");
    }
}
