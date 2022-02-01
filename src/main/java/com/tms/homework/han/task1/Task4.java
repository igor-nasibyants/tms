package com.tms.homework.han.task1;

public class Task4 {
    public static void main(String[] args) {
        int[] arr = new int[20];
        System.out.print("Массив: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ((int) (Math.random() * 20));
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.print("Массив с 0: ");
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0) {
                arr[i] = 0;
            }
            System.out.print(arr[i] + " ");
        }
    }
}
