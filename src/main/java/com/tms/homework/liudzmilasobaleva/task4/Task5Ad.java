package com.tms.homework.liudzmilasobaleva.task4;

public class Task5Ad {

    //5) «Сожмите» массив, выбросив из него каждый второй элемент.
    //«Освободившиеся» места массива заполните нулями.
    public static void main(String[] args) {
        //int[] array = {53, 5, 8, 54, 8, 10, 11};
        //int[] array = {49, 50, 9, 54, 8, 10, 11};
        int[] array = {1, 2, 3, 4, 5};
        //int[] array = {5, 4, 3, 2, 1};
        //int[] array = {1, 9, 8, 9, 6, 5, 4, 3, 2, 1};
        //int[] array = {5, 5, 5, 3, 4, 5, 5, 5};
        //int[] array = {5, 5, 5, 5, 4, 5, 5, 5};
        //int[] array = {4, 0, 4, 4, 5, 4, 4, 4};

        //меняем каждый второй элемент на 0
        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                array[i] = 0;
            } else {
                array[i] = array[i];
            }
        }

        //"сжимаем" массив
        int temp;
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] == 0) {
                for (int j = i; j < array.length - 1; j++) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        //выводим "сжатый" массив
        System.out.print("Compressed array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}