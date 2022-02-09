package com.tms.homework.liudzmilasobaleva.task4;

public class Task5Ad {
    //5) «Сожмите» массив, выбросив из него каждый второй элемент.
    //«Освободившиеся» места массива заполните нулями.
    public static void main(String[] args) {
        //int[] array = {53, 5, 8, 54, 8, 10, 11};
        //int[] array = {49, 50, 9, 54, 8, 10, 11};
        //int[] array = {1, 2, 3, 4, 5};
        //int[] array = {5, 4, 3, 2, 1};
        int[] array = {1, 9, 8, 9, 6, 5, 4, 3, 2, 1};
        //int[] array = {5, 5, 5, 3, 4, 5, 5, 5};
        //int[] array = {5, 5, 5, 5, 4, 5, 5, 5};
        //int[] array = {4, 0, 4, 4, 5, 4, 4, 4};


        //создаем второй ("сжатый") массив
        int[] array2 = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                array2[i] = 0;
            } else {
                array2[i] = array[i];
            }
        }

        //выводим "сжатый" массив
        System.out.print("Compressed array: ");
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }
    }
}