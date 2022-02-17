package com.tms.homework.nnazarv.task1.task4;

import java.util.Arrays;

public class Task7 {
    public static void main(String[] args) {
        int[] array = new int[12];
        for (int i = 0; i< array.length; i++){
            array[i] = (int) (Math.random() * 15);
        }
        System.out.println(Arrays.toString(array));

        int maxValue = array[0];
        int maxIndex = 0;

        for (int i = 1; i <= array.length - 1; i++){
            if (maxValue <= array[i]){
                maxValue = array[i];
                maxIndex = i;
            }
        }
        System.out.println("Index " + maxIndex + " : max value " + maxValue);
    }
}
