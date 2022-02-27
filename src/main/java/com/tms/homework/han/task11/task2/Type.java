package com.tms.homework.han.task11.task2;

public enum Type {
    ANNUAL("annual"), PERENNIAL("perennial"), BIENNIAL("biennial");
    private String value;

    Type(String value) {
        this.value = value;
    }

    public static Type fromValue(String value) {
        Type result = Type.ANNUAL;
        for (Type type : Type.values()) {
            result = type;
        }
        return result;
    }
}

