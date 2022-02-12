package com.tms.homework.liudzmilasobaleva.task4;

public class Task4Ad {

    //4) Найти наименьший нечетный элемент.
    public static void main(String[] args) {
        //int[] array = {53, 5, 8, 54, 8, 2, 10, 11};
        int[] array = {49, 50, 9, 54, 8, 10, 11};
        //int[] array = {1, 2, 3, 4, 5};
        //int[] array = {0, 6, 4, 2, 2, 0};
        //int[] array = {0, 9, 8, 9, 6, 5, 4, 3, 2};
        //int[] array = {5, 5, 5, 3, 4, 5, 5, 5};
        //int[] array = {5, 5, 5, 5, 4, 5, 5, 5};
        //int[] array = {4, 0, 4, 4, 5, 4, 4, 4};

        int index = -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                if (index < 0) {
                    index = i;
                } else if (array[i] < array[index]) {
                    index = i;
                }
            }
        }
        if (index < 0) {
            System.out.println("There are no odd numbers in the array");
        } else {
            System.out.print("Smallest odd element is " + array[index]);
        }
    }
}