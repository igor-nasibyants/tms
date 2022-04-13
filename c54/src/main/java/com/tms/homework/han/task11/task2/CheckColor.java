package com.tms.homework.han.task11.task2;

public interface CheckColor {
    static void checkColor(String color) throws ColorException {
        if (!(color.equalsIgnoreCase(Color.RED.name()))
                && !(color.equalsIgnoreCase(Color.BLUE.name()))
                && !(color.equalsIgnoreCase(Color.GREEN.name()))
                && !(color.equalsIgnoreCase(Color.YELLOW.name()))) {
            throw new ColorException("У растений нет " + color + " цвета");
        }
    }
}
