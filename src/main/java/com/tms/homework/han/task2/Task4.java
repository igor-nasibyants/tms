package com.tms.homework.han.task2;

//        Посчитать сумму четных элементов стоящих над побочной диагональю (не
//        включительно)

public class Task4 {
    public static void main(String[] args) {
        int[][] arr = Main.getArr();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length - i - 1; j++) {
                if (arr[i][j] % 2 == 0) {
                    sum += arr[i][j];
                }
            }
        }
        System.out.println("Сумма выше побочной оси: " + sum);
    }
}
