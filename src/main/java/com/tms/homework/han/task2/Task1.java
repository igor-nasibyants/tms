package com.tms.homework.han.task2;

public class Task1 {
    public static void main(String[] args) {
        int[][] arr = Main.getArr();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i + 1; j++) {
                if (arr[i] == arr[j] && arr[i][j] % 2 == 0) {
                    sum += arr[i][j];
                    break;
                }
            }
        }
        System.out.println("Сумма четных элементов на главной диагонали: " + sum);
    }
}
