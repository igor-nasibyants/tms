package com.tms.homework.han.task11.task2;

public enum Type {
    ANNUAL("annual"), PERENNIAL("perennial"), BIENNIAL("biennial");

    private final String value;

    Type(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}

