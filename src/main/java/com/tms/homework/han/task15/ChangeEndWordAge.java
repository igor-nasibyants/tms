package com.tms.homework.han.task15;

public interface ChangeEndWordAge {
    static String change(Integer age) {
        if (age % 10 == 1 && age != 11) {
            return "год";
        } else if (age % 10 > 1 && age < 5) {
            return "года";
        } else {
            return "лет";
        }
    }
}
