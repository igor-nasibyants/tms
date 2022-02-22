package com.tms.homework.nikitaelenski.task5;

public class TwoDimensionalArrays {
    public static void MatrixPrintout(int array[][]) {
        int k = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = k;
                k++;
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

    public static void SummArray(int array[][]) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i] == array[j] && array[i][j] % 2 == 0) {
                    sum += array[i][j];
                }
            }
        }
        System.out.println("сумму четных элементов стоящих на главной диагонали " + sum);
    }

    public static void DiagonalProduct(int array[][]) {
        int summmm = 1;
        int summm = 1;
        for (int w = 0; w < array.length; w++) {
            for (int e = 0; e < array[w].length; e++) {
                if (array[w] == array[e]) {
                    summm *= array[w][e];
                }
            }
        }
        System.out.println("Произведение  элементов на главной диагонали " + summm);
        for (int r = array.length - 1; r >= 0; r--) {
            for (int t = array.length - 1 - r; t <= array[r].length; t--) {
                summmm *= array[r][t];
                break;
            }
        }

        System.out.println("Произведение  элементов на побочной диагонали " + summmm);
        if (summm < summmm) {
            System.out.println("главная диагональ больше");
        } else if (summm > summmm) {
            System.out.println("побочьная диагональ больше");
        } else {
            System.out.println("ровныф");
        }
    }
}
