package com.tms.homework.han.epamTasks.arrays;

//      Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        double[] arr = new double[]{0.2, 10, 3.9, 22, 23, 0, -10.5};
        double max = Integer.MIN_VALUE;
        double min = Integer.MAX_VALUE;
        int indexMax = 0, indexMin = 0;
        System.out.println("Массив: " + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                indexMax = i;
            }
            if (min > arr[i]) {
                min = arr[i];
                indexMin = i;
            }
        }
        double tmp = arr[indexMax];
        arr[indexMax] = arr[indexMin];
        arr[indexMin] = tmp;
        System.out.println("Новый массив: " + Arrays.toString(arr));
    }
}
