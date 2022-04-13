package com.tms.task.task3;


import java.util.List;

public class Task3 {

    public Boolean validateMonth(Integer days) {
        System.out.println("Input parameter days = " + days);
        if (days < 31) {
            return Boolean.TRUE;
        } else {
            return Boolean.FALSE;
        }
    }

    public String checkNumberConditions(double number) {
        StringBuilder stringBuilder = new StringBuilder();
        if (number > 0) {
            stringBuilder.append("Число положительное");
            if (number % 1 == 0) {
                stringBuilder.append(", целое");
                if (number % 2 == 0) {
                    stringBuilder.append(", четное");
                } else {
                    stringBuilder.append(", нечетное");
                }
            } else {
                stringBuilder.append(", дробное");
            }
        }
        return stringBuilder.toString();
    }

    public String nameOfDay(String number) {
        return "";
    }

    public String nameOfDay(int number) {
        if (number > 7 || number < 1)
            throw new IllegalArgumentException("Номер дня недели не может быть больше 7 и меньше 1");

        String result = null;
        switch (number) {
            case 1:
                result = "Понедельник";
                break;
            case 2:
                result = "Вторник";
                break;
            case 3:
                result = "Среда";
                break;
            case 4:
                result = "Четверг";
                break;
            case 5:
                result = "Пятница";
                break;
            case 6:
                result = "Суббота";
                break;
            case 7:
                result = "Воскресенье";
                break;
            default:
                break;
        }
        return result;
    }

    public void printOnlyOddPositive(int number) {
        if (number < 1)
            throw new IllegalArgumentException("Число должно быть больше 0");

        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public Integer getFirstOdd(List<Integer> numbers) {
        Integer result = null;
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                result = number;
                break;
            }
        }
        return result;
    }

    public void printRandomLessThen10() {
        int i = 0;
        while (Math.random() < 10) {
            if (i >= 100) {
                break;
            } else {
                i++;
            }
            System.out.println("Print random " + i);
        }
    }

    public void printTwice() {
        for (int i = 1; i <= 7; i++) {
            System.out.println("Я выполняюсь перед continue");
            if (i > 2)
                continue;
            System.out.println("Я выполняюсь всего дважды");
        }
    }

    public static void printAtLeastOnce() {
        int i = 10;
        do {
            System.out.println("Число i имеет значение " + i);
            i--;
            if (i < -10) break;
        } while (i < 3);
    }
}
