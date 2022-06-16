package com.tms.homework.pavelgrigoryev.patterns.javaee.helloworldenterpriseedition;

public class StatusCodeImplementation implements IStatusCode {
    private final int code;

    public StatusCodeImplementation(int code) {
        this.code = code;
    }

    @Override
    public int getStatusCode() {
        return code;
    }
}
