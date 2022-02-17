package com.tms.homework.nnazarv.task1.task4;

public class Task1 {
    public static void main(String[] args) {
        int[] array = new int[10];
        int a = 0;
        int i;
        for (i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                array[a] = i;
                System.out.print(array[a] + " ");
                a++;
            }
        }
        for (i = 0; i < array.length; i++ ){
            System.out.print("\n" + array[i]);
        }

    }
}
