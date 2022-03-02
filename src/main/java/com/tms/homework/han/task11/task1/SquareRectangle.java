package com.tms.homework.han.task11.task1;


public interface SquareRectangle extends GetNumber, CheckNegative {
    static int squareRectangle() {
        int a = 0;
        try {
            a = (int) GetNumber.getNumber("a");
            CheckNegative.checkNegative(a);
        } catch (MyException e) {
            e.printStackTrace();
        }
        int b = 0;
        try {
            b = (int) GetNumber.getNumber("b");
            CheckNegative.checkNegative(b);
        } catch (MyException e) {
            e.printStackTrace();
        }
        return a * b;
    }
}
