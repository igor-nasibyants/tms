package com.tms.homework.han.task11.task1;

public interface CheckNull {
    static void checkNull(double a, String text) throws MyException {
        if (a == 0) {
            throw new MyException("Опппппааа кто-то схитрил и ввел 0 в значение <" + text + ">, так низя");
        }
    }
}
