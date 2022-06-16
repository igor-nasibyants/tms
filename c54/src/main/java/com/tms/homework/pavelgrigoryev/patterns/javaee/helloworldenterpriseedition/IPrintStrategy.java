package com.tms.homework.pavelgrigoryev.patterns.javaee.helloworldenterpriseedition;

public interface IPrintStrategy {
    IStatusCode setupPrinting();

    IStatusCode print(IHelloWorldString string);
}
