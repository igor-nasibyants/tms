package com.tms.homework.han.task11.task1;

public interface CheckNegative {
    static void checkNegative(double a) throws MyException {
        if (a < 0) {
            throw new MyException("Ээээээ, полученно отрицательное число(" + a + "), так низя");
        }
    }
}
