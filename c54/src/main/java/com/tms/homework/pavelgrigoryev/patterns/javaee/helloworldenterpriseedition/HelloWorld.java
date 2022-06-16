package com.tms.homework.pavelgrigoryev.patterns.javaee.helloworldenterpriseedition;

public class HelloWorld {

    public static void main(String[] args) {
        instantiateHelloWorldMainClassAndRun();
    }

    public static void instantiateHelloWorldMainClassAndRun() {
        new HelloWorld();
    }

    public HelloWorld() {
        HelloWorldFactory factory = HelloWorldFactory.getInstance();
        IHelloWorld helloWorld = factory.createHelloWorld();
        IHelloWorldString helloWorldString = helloWorld.getHelloWorld();
        IPrintStrategy printStrategy = helloWorld.getPrintStrategy();
        IStatusCode code = helloWorld.print(printStrategy, helloWorldString);
        if (code.getStatusCode() != 0) {
            throw new RuntimeException("Failed to print: " + code.getStatusCode());
        }
    }
}
