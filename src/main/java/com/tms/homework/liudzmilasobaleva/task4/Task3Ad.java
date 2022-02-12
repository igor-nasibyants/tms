package com.tms.homework.liudzmilasobaleva.task4;

public class Task3Ad {

    //3) Найти средне арифметическое элементов массива, превосходящих некоторое
    //число С.
    public static void main(String[] args) {
        int[] array = {53, 5, 8, 54, 8, 10, 11};
        //int[] array = {49, 50, 9, 54, 8, 10, 11};
        //int[] array = {1, 2, 3, 4, 5};
        //int[] array = {5, 4, 3, 2, 1};
        //int[] array = {1, 9, 8, 9, 6, 5, 4, 3, 2, 1};
        //int[] array = {5, 5, 5, 3, 4, 5, 5, 5};
        //int[] array = {5, 5, 5, 5, 4, 5, 5, 5};
        //int[] array = {4, 0, 4, 4, 5, 4, 4, 4};

        int c = 4;

        int sum = 0;
        int index = 0;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > c) {
                array[index] = array[i];
                sum = sum + array[i];
                count++;
                index++;
            }
        }
        double am = (double) sum / count;
        System.out.print("Arithmetic mean of array elements greater than C is ");
        System.out.println(am);
    }
}