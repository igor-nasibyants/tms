package com.tms.homework.han.task11.task4;

import com.tms.homework.han.task11.task1.MyException;

public interface CheckLess {
    static void checkLess(int number, int start) throws MyException {
        if (number < start) {
            throw new MyException("Получено оочень маленькое число, поднажмите!");
        }
    }
}
