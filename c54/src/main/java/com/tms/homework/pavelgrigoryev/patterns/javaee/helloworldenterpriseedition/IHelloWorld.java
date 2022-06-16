package com.tms.homework.pavelgrigoryev.patterns.javaee.helloworldenterpriseedition;

public interface IHelloWorld {
    IHelloWorldString getHelloWorld();

    IPrintStrategy getPrintStrategy();

    IStatusCode print(IPrintStrategy strategy, IHelloWorldString toPrint);
}
