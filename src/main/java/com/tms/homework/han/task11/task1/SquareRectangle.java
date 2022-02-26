package com.tms.homework.han.task11.task1;

import static com.tms.homework.han.task11.task1.GetNumber.getNumber;

public interface SquareRectangle {
    static int squareRectangle() {
        int a = getNumber("a");
        int b = getNumber("b");
        return a * b;
    }
}
