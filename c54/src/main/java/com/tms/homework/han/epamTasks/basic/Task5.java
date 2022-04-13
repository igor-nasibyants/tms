package com.tms.homework.han.epamTasks.basic;

//        Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести
//        данное значение длительности в часах, минутах и секундах в следующей форме:
//        ННч ММмин SSc.

public class Task5 {
    public static void main(String[] args) {
        System.out.println(getForm(150119));
    }

    public static String getForm(int seconds) {
        return (seconds / 3600 + "ч " + (seconds % 3600) / 60 + "мин " + (seconds % 3600) % 60 + "c");
    }
}
