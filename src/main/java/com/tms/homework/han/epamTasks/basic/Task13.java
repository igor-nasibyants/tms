package com.tms.homework.han.epamTasks.basic;

//        Вычислить значения функции на отрезке [а,b] c шагом h

public class Task13 {
    public static void main(String[] args) {
        getValue(5, 2, 0, 10);
    }

    public static void getValue(int x, int h, int a, int b) {
        int y;
        for (int i = a; i <= b; i += h) {
            if (x > 2) {
                y = x;
            } else {
                y = -x;
            }
            System.out.println("y: " + y);
        }
    }
}
