package com.tms.homework.han.task11.task2;

public enum Color {
    RED("red"), GREEN("green"), BLUE("blue"), YELLOW("yellow");

    private String value;

    Color(String value) {
        this.value = value;
    }

    public Color fromValue(String value) {
        Color result = Color.RED;
        for (Color color : Color.values()) {
            result = color;
        }
        return result;
    }
}
