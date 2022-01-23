package com.tms.task3;

public class Task3 {

    public static Boolean validateMonth(Integer days) {
        System.out.println("Input parameter days = " + days);
        if (days < 31) {
            return Boolean.TRUE;
        } else {
            return Boolean.FALSE;
        }
    }

    public static String checkNumberConditions(double number) {
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

    public static String nameOfDay(int number) {
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
}
