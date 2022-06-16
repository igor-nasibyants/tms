package com.tms.homework.pavelgrigoryev.patterns.javaee.helloworldenterpriseedition;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class PrintStrategyImplementation implements IPrintStrategy {
    private OutputStream print;

    @Override
    public IStatusCode setupPrinting() {
        try {
            FileDescriptor descriptor = FileDescriptor.out;
            print = new FileOutputStream(descriptor);
            return new StatusCodeImplementation(0);
        } catch (Exception e) {
            return new StatusCodeImplementation(-1);
        }
    }

    @Override
    public IStatusCode print(IHelloWorldString string) {
        try {
            print.write(string
                    .getHelloWorldString()
                    .getHelloWorldString()
                    .concat("\n")
                    .getBytes(StandardCharsets.UTF_8));
            return new StatusCodeImplementation(0);
        } catch (Exception e) {
            return new StatusCodeImplementation(-1);
        }
    }
}
