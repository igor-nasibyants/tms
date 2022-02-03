package com.tms.homework.han.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        getArr();
    }

    public static int[][] getArr() {
        System.out.println("Введите размерность матрицы n*m. n и m должны быть больше 1!");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        while (n < 1 || m < 1) {
            System.out.println("n и m должны быть больше 1!");
            n = scanner.nextInt();
            m = scanner.nextInt();
        }
        int[][] arr = new int[n][m];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 50);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        return arr;
    }
}
