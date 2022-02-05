package com.tms.homework.han.epamTasks.basic;

//        Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через
//        отверстие.

public class Task10 {
    public static void main(String[] args) {
        isEnough(10, 10, 2, 12, 12);
    }

    public static void isEnough(int a, int b, int x, int y, int z) {
        if ((a >= x && b >= y || a >= y && b >= x) ||
                (a >= x && b >= z || a >= z && b >= x) ||
                (a >= y && b >= z || a >= z && b >= y)) {
            System.out.println("Пройдет");
        } else {
            System.out.println("Не пройдет");
        }
    }
}
