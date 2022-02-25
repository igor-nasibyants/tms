package com.tms.homework.han.task10.task4;

public interface Formatable {
    static String formatting(String str) {
        return str.replaceAll("[^a-zA-Z ]", "").replaceAll("\\s+", " ");
    }
}
