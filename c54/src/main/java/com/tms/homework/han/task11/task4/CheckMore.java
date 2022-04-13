package com.tms.homework.han.task11.task4;

import com.tms.homework.han.task11.task1.MyException;

public interface CheckMore {
    static void checkMore(int number, int end) throws MyException {
        if (number > end) {
            throw new MyException("Получено оочень большое число, охладите свой пыл, плез");
        }
    }
}
