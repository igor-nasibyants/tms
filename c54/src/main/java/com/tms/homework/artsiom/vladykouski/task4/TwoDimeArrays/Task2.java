package com.tms.homework.artsiom.vladykouski.task4.TwoDimeArrays;

public class Task2 {
    public static void main(String[] args) {
        //2)Вывести нечетные элементы находящиеся под главной диагональю(включительно)
        MyArray d = new MyArray();
        d.getArr();
        int n = d.getN();
        int i, j;
        int[][] arr = d.getA();
        System.out.println();
        System.out.println();
        for (i = 1; i < n; i++) {
            for (j = 0; j < n; j++) {
                if (i - 1 == j & arr[i][j] % 2 != 0) {
                    System.out.print(" " + arr[i][j] + " ");
                }
            }
        }
    }
}