package com.tms.homework.han.task11.task1;

public interface CheckNegative {
    static void checkNegative(int a, String text) throws MyException {
        if (a < 0) {
            System.err.println("Опппппааа кто-то схитрил и ввел отрицательное число <" + text + ">, так низя");
            System.exit(0);
        }
    }
}
