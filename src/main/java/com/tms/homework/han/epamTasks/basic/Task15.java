package com.tms.homework.han.epamTasks.basic;

//        Составить программу нахождения произведения квадратов первых двухсот чисел.

public class Task15 {
    public static void main(String[] args) {
        getMul();
    }

    public static void getMul() {
        int mul = 1;
        for (int i = 1; i < 201; i++) {
            mul *= Math.pow(i, 2);
        }
        System.out.println("Произведение квадратов от 1 до 200: " + mul);
    }
}
