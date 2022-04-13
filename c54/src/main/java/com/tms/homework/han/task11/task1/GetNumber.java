package com.tms.homework.han.task11.task1;

import java.util.Scanner;

public interface GetNumber extends CheckNegative, CheckNull {
    static double getNumber(String text) throws MyException {
        Scanner scanner = new Scanner(System.in);
        double number = 0;
        System.out.println("Введите число " + text + ":");
        if (scanner.hasNextDouble()) {
            number = scanner.nextDouble();
            try {
                CheckNull.checkNull(number, text);
            } catch (MyException e) {
                e.printStackTrace();
            }
        } else {
                throw new MyException("В значение <" + text + "> вы ввели не число");
            }
        return number;
    }
}
