package com.tms.homework.han.task4;

//      «Сожмите» массив, выбросив из него каждый второй элемент.
//      «Освободившиеся» места массива заполните нулями

public class Task5Advanced {
    public static void main(String[] args) {
        int n = 10;
        int[] arr = new int[n];
        System.out.print("Массив: ");
        for (int i = 0; i < n; i++) {
            arr[i] = ((int) (Math.random() * 15));
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.print("Массив после 'сжатия': ");
        for (int i = 0, j = 0; i < n; i++, j += 2) {
            arr[i] = arr[j];
            n--;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.print("Массив с нулями: ");
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0) {
                arr[i] = 0;
            }
            System.out.print(arr[i] + " ");
        }
    }
}

