package com.tms.homework.liudzmilasobaleva.task4;

public class Task3Ad {

    //3) Найти средне арифметическое элементов массива, превосходящих некоторое
    //число С.
    public static void main(String[] args) {
        //int[] array = {53, 5, 8, 54, 8, 10, 11};
        //int[] array = {49, 50, 9, 54, 8, 10, 11};
        //int[] array = {1, 2, 3, 4, 5};
        //int[] array = {5, 4, 3, 2, 1};
        int[] array = {1, 9, 8, 9, 6, 5, 4, 3, 2, 1};
        //int[] array = {5, 5, 5, 3, 4, 5, 5, 5};
        //int[] array = {5, 5, 5, 5, 4, 5, 5, 5};
        //int[] array = {4, 0, 4, 4, 5, 4, 4, 4};

        int c = 2;

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > c) {
                count++;
            }
        }

        //создаем второй массив из элементов, превосходящих число С
        int[] array2 = new int[count];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > c) {
                array2[index] = array[i];
                index++;
            }
        }
        System.out.println();

        //выводим элементы превосходящие С
        System.out.print("Second array: ");
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }
        System.out.println();

        //выводим среднее ариметическое элементов превосходящих С
        System.out.print("Arithmetic mean of array elements greater than C is ");
        int sum = 0;
        for (int i = 0; i < array2.length; i++) {
            sum = sum + array2[i];
        }
        double am = (double) sum / array2.length;
        System.out.println(am);
    }
}