package com.tms.homework.han.task11.task2;

public enum Color {
    RED("red"), GREEN("green"), BLUE("blue"), YELLOW("yellow");

    private final String value;

    Color(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
