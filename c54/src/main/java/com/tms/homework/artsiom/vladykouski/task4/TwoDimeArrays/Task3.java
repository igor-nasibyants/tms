package com.tms.homework.artsiom.vladykouski.task4.TwoDimeArrays;

public class Task3 {
    public static void main(String[] args) {
        // 3)Проверить произведение элементов какой диагонали больше.
        MyArray d = new MyArray();
        d.getArr();
        int n = d.getN();
        int i, j;
        int count1 = 1, count2 = 1, count3 = 1, count4 = 1;
        int[][] arr = d.getA();
        for (i = 1; i < n; i++) {
            for (j = 0; j < n - 1; j++) {
                if (i == j) {
                    count1 = count1 * arr[i][j];

                }
                if (i - 1 == j) {
                    count2 = count2 * arr[i - 1][j];
                }
                if (i == j + 1) {
                    count3 = count3 * arr[i][j + 1];
                }
            }
        }
        System.out.print(count1);
        System.out.println();
        System.out.print(count2);
        System.out.println();
        System.out.print(count3);
    }
}

