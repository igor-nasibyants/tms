package com.tms.homework.han.epamTasks.arrays;

//        Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
//        положительных и нулевых элементов

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        double[] arr = new double[]{-10.2, 1.5, 0, 4.0, 7.9, 0.5, 4.4, 5.4, -1, -4.3, 1.1, -0.8, 7.66, 4, 0, 0, 0, 66.6, 33, -10.3};
        int positive = 0;
        int negative = 0;
        int zero = 0;
        for (double key : arr) {
            if (key < 0) {
                negative++;
            } else if (key == 0) {
                zero++;
            } else {
                positive++;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Положительных чисел в массиве: " + positive + ", отрицательных: " + negative + ", нулевых: " + zero);
    }
}
