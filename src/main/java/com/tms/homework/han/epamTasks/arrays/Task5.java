package com.tms.homework.han.epamTasks.arrays;

//      Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        int[] arr = new int[15];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10);
        }
        System.out.println(Arrays.toString(arr));
        getBigNumber(arr, 4);
    }

    public static void getBigNumber(int[] arr, int i) {
        for (int key : arr) {
            if (key > i) {
                System.out.print(key + " ");
            }
        }
    }
}
