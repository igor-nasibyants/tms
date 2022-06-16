package com.tms.homework.pavelgrigoryev.patterns.javaee.helloworldenterpriseedition;

public class HelloWorldImplementation implements IHelloWorld {
    @Override
    public IHelloWorldString getHelloWorld() {
        return new HelloWorldStringImplementation();
    }

    @Override
    public IPrintStrategy getPrintStrategy() {
        PrintStrategyFactory factory = PrintStrategyFactory.getInstance();
        return factory.createIPrintStrategy();
    }

    @Override
    public IStatusCode print(IPrintStrategy strategy, IHelloWorldString toPrint) {
        return strategy.print(toPrint);
    }
}
