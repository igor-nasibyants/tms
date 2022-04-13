package com.tms.homework.han.epamTasks.basic;

//        Найдите значение функции: z = ( (a – 3 ) * b / 2) + c

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Значение функции: " + calcValue(4, 4, 1));
    }

    public static int calcValue(int a, int b, int c) {
        return ((a - 3) * b / 2) + c;
    }
}
