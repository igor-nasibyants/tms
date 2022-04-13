package com.tms.homework.han.epamTasks.arrays;

//        Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z, этим
//        числом. Подсчитать количество замен.

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int z = 10;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 20);
        }
        for (int key : arr) {
            if (key > z) {
                key = z;
                count++;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Количество замен: " + count);
    }
}
