package com.tms.homework.nnazarv.task1.task4;

public class Task3 {
    public static void main(String[] args) {
        int[] array = new int[15];


        for (int i = 0; i <= array.length - 1; i++) {
            int random_number = (int) (Math.random() * 99);
            array[i] = random_number;
            System.out.print(array[i] + " ");
        }

        System.out.println();

        for (int i = 0; i <= array.length - 1; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }
    }
}
