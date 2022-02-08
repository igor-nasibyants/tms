package com.tms.homework.han.task5;

//      Проверить произведение элементов какой диагонали больше

public class Task3 {
    public static void main(String[] args) {
        int[][] arr = Main.getArr();
        int sumMainDiagonal = 1;
        int sumOtherDiagonal = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i] == arr[j]) {
                    sumMainDiagonal *= arr[i][j];
                }
            }
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = arr.length - i - 1; j <= arr[i].length; ) {
                sumOtherDiagonal *= arr[i][j];
                break;
            }
        }
        if (sumMainDiagonal > sumOtherDiagonal) {
            System.out.println("Произведение главной диагонали брольше");
        } else if (sumOtherDiagonal > sumMainDiagonal) {
            System.out.println("Произведение побочной диагонали больше");
        } else {
            System.out.println("Диагонали равны");
        }
    }
}
