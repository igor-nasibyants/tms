package com.tms.homework.liudzmilasobaleva.task4;

public class Task7Ad {
    //7) Подсчитать, сколько раз встречается элемент с заданным значением.

    public static void main(String[] args) {
        //int[] array = {53, 5, 8, 54, 8, 10, 11};
        //int[] array = {49, 50, 9, 54, 8, 10, 11};
        //int[] array = {1, 2, 3, 4, 5};
        //int[] array = {5, 4, 3, 2, 1};
        int[] array = {1, 9, 8, 9, 6, 5, 4, 3, 2, 1};
        //int[] array = {5, 5, 5, 3, 4, 5, 5, 5};
        //int[] array = {5, 5, 5, 5, 4, 5, 5, 5};
        //int[] array = {4, 4, 4, 4, 4, 4, 4, 4};

        int c = 5;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == c) {
                count++;
            }
        }
        System.out.println("c occurs " + count + " time(s)");
    }
}