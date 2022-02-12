package com.tms.homework.liudzmilasobaleva.task4;

public class Task9Ad {
    //9) Найти наименьший элемент среди элементов с четными индексами массива
    public static void main(String[] args) {
        //int[] array = {53, 5, 8, 54, 8, 10, 11};
        //int[] array = {49, 50, 8, 54, 8, 10, 11};
        //int[] array = {1, 2, 3, 4, 5};
        //int[] array = {5, 4, 3, 2, 1};
        int[] array = {10, 9, 8, 9, 6, 5, 4, 3, 2, 1};
        //int[] array = {5, 5, 5, 3, 4, 5, 5, 5};
        //int[] array = {5, 4, 5, 4, 5, 4, 5, 4};

        int index = -1;

        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                if (index < 0) {
                    index = i;
                } else if (array[i] < array[index]) {
                    index = i;
                }
            }
        }
        System.out.print("Smallest element with even index is " + array[index]);
    }
}