package com.tms.homework.han.task11.task1;


public interface SquareRectangle extends GetNumber, CheckNegative {
    static int squareRectangle() {
        int a = (int) GetNumber.getNumber("a");
        try {
            CheckNegative.checkNegative(a);
        } catch (MyException e) {
            e.printStackTrace();
            System.exit(0);
        }
        int b = (int) GetNumber.getNumber("b");
        try {
            CheckNegative.checkNegative(b);
        } catch (MyException e) {
            e.printStackTrace();
            System.exit(0);
        }
        return a * b;
    }
}
