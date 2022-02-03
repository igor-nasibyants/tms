package com.tms.homework.han.task1;

//        Найти наименьший нечетный элемент.

public class Task4Advanced {
    public static void main(String[] args) {
        int[] arr = new int[10];
        System.out.print("Массив: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ((int) (Math.random() * 15));
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int min = arr[0];
        for (int key : arr) {
            if (min >= key) {
                min = key;
            }
        }
        System.out.println("Минимальный элемент в массиве: " + min);
    }
}
