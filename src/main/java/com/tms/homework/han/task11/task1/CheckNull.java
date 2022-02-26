package com.tms.homework.han.task11.task1;

public interface CheckNull {
    static void checkNull(int a, String text) throws MyException {
        if (a == 0) {
            System.err.println("Опппппааа кто-то схитрил и ввел 0 в <" + text + ">, так низя");
            System.exit(0);
        }
    }
}
