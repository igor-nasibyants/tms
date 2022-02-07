package com.tms.homework.nnazarv.task1;

import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
        int[] arr = new int[4];
        for (int i = 0; i <= arr.length - 1; i++){
            arr[i] = (int) (Math.random() * 10);
        }
        System.out.println(Arrays.toString(arr));

        boolean action = true;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < arr[i+1] ) {
                action = false;
                break;
            }
        }
        if (action){
            System.out.println("Массив является строго возрастающей последовательностью.");
        } else {
            System.out.println("Массив не является строго возрастающей последовательностью.");
        }

    }
}
