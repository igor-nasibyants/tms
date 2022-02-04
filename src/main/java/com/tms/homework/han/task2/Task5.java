package com.tms.homework.han.task2;

//        Транспонировать матрицу(1 столбец станет 1-й строкой, 2-й столбец - 2-й
//        строкой и т. д.)

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        int[][] arr = Main.getArr();

//      First Method
        System.out.println("Полученная матрица (просто распечатка, без изменения расположения элементов матрицы)");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }

//      Second Method
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr[i].length; j++) {
                int tmp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = tmp;
            }
        }
        System.out.println("Полученная матрица (с изменением расположения элементов)");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
