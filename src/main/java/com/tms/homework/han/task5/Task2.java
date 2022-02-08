package com.tms.homework.han.task5;

//        Вывести нечетные элементы находящиеся под главной
//        диагональю(включительно)

public class Task2 {
    public static void main(String[] args) {
        int[][] arr = Main.getArr();
        System.out.println("Нечетные элементы находящиеся под главной диагональю(включительно):");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i + 1; j++) {
                if (arr[i][j] % 2 != 0) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
    }
}
