package com.tms.homework.han.epamTasks.arrays;

//        В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 21, 21, 44, 2, 3, 4, 5, 1, 6, 7, 7, 27};
        int sum = 0;
        int k = 3;
        for (int key : arr) {
            if (key % k == 0) {
                sum += key;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Сумма элементов, которые кратны " + k + ": " + sum);
    }
}
