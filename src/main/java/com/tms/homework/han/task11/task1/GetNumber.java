package com.tms.homework.han.task11.task1;

import java.util.Scanner;

public interface GetNumber extends CheckNegative, CheckNull {
    static int getNumber(String text) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        System.out.println("Введите число " + text + ":");
        if (scanner.hasNextInt()) {
            number = scanner.nextInt();
            try {
                CheckNegative.checkNegative(number, text);
                CheckNull.checkNull(number, text);
            } catch (MyException e) {
                e.printStackTrace();
                System.exit(0);
            }
        } else {
            try {
                throw new MyException("В <" + text + "> вы ввели не число");
            } catch (MyException e) {
                e.printStackTrace();
                System.exit(0);
            }
        }
        return number;
    }
}
