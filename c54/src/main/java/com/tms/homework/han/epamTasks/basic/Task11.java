package com.tms.homework.han.epamTasks.basic;

// Вычислить значение функции

public class Task11 {
    public static void main(String[] args) {
        System.out.println(getFunction(3));
    }

    public static double getFunction(int x) {
        return x <= 3 ? Math.pow(x, 2) - 3 * x + 9 : 1 / (Math.pow(x, 3) + 6);
    }
}
