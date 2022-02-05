package com.tms.homework.han.epamTasks.basic;

//        Найти max{min(a, b), min(c, d)}

public class Task8 {
    public static void main(String[] args) {
        System.out.println(getMaxValue(1, 5, -2, 4));
    }

    public static int getMaxValue(int a, int b, int c, int d) {
        return Math.max(Math.min(a, b), Math.min(c, d));
    }
}
