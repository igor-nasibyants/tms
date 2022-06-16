package com.tms.homework.pavelgrigoryev.patterns.javaee.helloworldenterpriseedition;

public class StringFactory {
    private static final StringFactory instance = new StringFactory();

    public static StringFactory getInstance() {
        return instance;
    }

    public HelloWorldString createHelloWorldString(String str) {
        HelloWorldString s = new HelloWorldString();
        s.s = str;
        return s;
    }
}
