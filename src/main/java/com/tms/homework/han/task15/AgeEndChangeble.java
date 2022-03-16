package com.tms.homework.han.task15;

public interface AgeEndChangeble {
    default String changeEndOfAgeWord(Integer age) {
        if (age % 10 == 1 && age != 11) {
            return "год";
        } else if (age % 10 > 1 && age < 5) {
            return "года";
        } else {
            return "лет";
        }
    }
}
