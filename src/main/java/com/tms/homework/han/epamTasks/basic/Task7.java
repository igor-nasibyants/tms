package com.tms.homework.han.epamTasks.basic;

//        Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли
//        он прямоугольным.

public class Task7 {
    public static void main(String[] args) {
        isTriangle(10, 10);
    }

    public static void isTriangle(int degree1, int degree2) {
        if ((degree1 <= 90 && degree2 < 90 || degree1 < 90 && degree2 <= 90) && degree1 != 0 && degree2 != 0) {
            System.out.println("Треугольник существует");
            if (degree1 == 90 || degree2 == 90) {
                System.out.println("Прямоугольный треуголик");
            }
        } else {
            System.out.println("Треугольника не существует");
        }
    }
}
