package com.tms.homework.artsiom.vladykouski.task4.TwoDimeArrays;

import java.util.Random;
import java.util.Scanner;

// Начало всех задач: Создаём квадратную матрицу, размер вводим с клавиатуры.
// Заполняем случайными числами в диапазоне от 0 до 50.
public class MyArray {
    Scanner sc = new Scanner(System.in);
    Random r = new Random();
    public int n = sc.nextInt();
    int i, j;
    public int[][] arr = new int[n][n];

    public MyArray() {
        if (n > 2) {
            for (i = 0; i < n; i++) {
                for (j = 0; j < n; j++) {
                    arr[i][j] = r.nextInt(51);
                }
            }
        } else {
            System.out.print(" Некорректное число");
        }
    }

    public void getArr() {
        if (n > 2) {
            for (i = 0; i < n; i++) {
                for (j = 0; j < n; j++) {
                    System.out.print(" " + arr[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

    public int getN() {
        return n;
    }

    public int[][] getA() {
        return arr;
    }
}
