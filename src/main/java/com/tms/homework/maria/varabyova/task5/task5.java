package com.tms.homework.maria.varabyova.task5;

import java.util.Random;
import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        System.out.println("Введите размерность матрицы");
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int n;
        n = sc.nextInt();

        int mass[][] = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mass[i][j] = r.nextInt(9);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mass[i][j] + " ");
            }
            System.out.println();
        }

        int max = mass[0][0];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (mass[i][j] > max) {
                    max = mass[i][j];
                }
            }
        }
        System.out.println("Максимальное значение = " + max);

        int min = mass[0][0];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (mass[i][j] < min) {
                    min = mass[i][j];
                }
            }
        }
        System.out.println("Минимальное значение = " + min);

        int summ = 0;
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass.length; j++) {
                if (i == j) {
                    summ += mass[i][j];
                }
            }
        }
        System.out.println("Сумма значений по главной диагонали = " + summ);

        int summ2 = 0;
        for (int i = 0; i < mass.length; i++) {
            for (int j = mass.length - 1 - i; j >= 0; j--) {
                summ2 += mass[i][j];
                break;
            }
        }
        System.out.println("Сумма элементов по побочной диагонали = " + summ2);


    }
}
