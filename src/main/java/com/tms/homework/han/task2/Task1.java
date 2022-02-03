package com.tms.homework.han.task2;

public class Task1 {
    public static void main(String[] args) {
        int[][] arr = Main.getArr();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i] == arr[j]) {
                    sum +=arr[i][j];
                }
            }
        }
        System.out.println("Сумма массива: " + sum);
    }
}
