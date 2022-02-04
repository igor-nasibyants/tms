package com.tms.homework.nnazarv.task1;

public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[50];
        int a = 0;
        int i;
        for (i = 1; i <= 100; i++) {
            if (i % 2 == 1) {
                array[a] = i;
                System.out.print(array[a] + " ");
                a++;
            }
        }

        System.out.println();

        for (i = array.length - 1; i >= 0; i-- ){
            System.out.print(array[i] + " ");

        }


    }
}
