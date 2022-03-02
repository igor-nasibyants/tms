package com.tms.homework.pavelgrigoryev.task11.task2;

public enum Type {
    SEAWEED, MOSSES, FERNS, CONIFEROUS, FLOWERING;

    public static Type type (String message) throws TypeException {
        if ("SEAWEED".equalsIgnoreCase(message)) {
            return SEAWEED;
        } else if ("MOSSES".equalsIgnoreCase(message)) {
            return MOSSES;
        } else if ("FERNS".equalsIgnoreCase(message)) {
            return FERNS;
        } else if ("CONIFEROUS".equalsIgnoreCase(message)) {
            return CONIFEROUS;
        } else if ("FLOWERING".equalsIgnoreCase(message)) {
            return FLOWERING;
        }
        throw new TypeException("Unknown type! : " + message);
    }
}
