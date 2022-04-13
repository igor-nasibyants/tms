package com.tms.homework.artsiom.vladykouski.task4.TwoDimeArrays;

public class Task1 {
    public static void main(String[] args) {
        //1) Посчитать сумму четных элементов стоящих на главной диагонали.
        MyArray d = new MyArray();
        d.getArr();
        int n = d.getN();
        int i, j;
        int count = 0;
        int[][] arr = d.getA();
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                if (i == j & arr[i][j] % 2 == 0) {
                    count = count + arr[i][j];
                }

            }

        }
        System.out.print(count);
    }
}
