package com.tms.homework.pavelgrigoryev.task11.secondtask;

public enum Color {
    GREEN, YELLOW, BLUE, RED, VIOLET;

    public static Color color(String message) throws ColorException {
        if ("GREEN".equalsIgnoreCase(message)) {
            return GREEN;
        } else if ("YELLOW".equalsIgnoreCase(message)) {
            return YELLOW;
        } else if ("BLUE".equalsIgnoreCase(message)) {
            return BLUE;
        } else if ("RED".equalsIgnoreCase(message)) {
            return RED;
        } else if ("VIOLET".equalsIgnoreCase(message)) {
            return VIOLET;
        }
        throw new ColorException("Unknown color! : " + message);
    }
}
