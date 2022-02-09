package com.tms.homework.liudzmilasobaleva.task4;

public class Task1Ad {
    //1) Найти произведение элементов, кратных 3.
    public static void main(String[] args) {
        //int[] array = {53, 5, 8, 54, 8, 10, 11};
        //int[] array = {49, 50, 9, 54, 8, 10, 11};
        //int[] array = {1, 2, 3, 4, 5};
        //int[] array = {5, 4, 3, 2, 1};
        int[] array = {1, 9, 8, 9, 6, 5, 4, 3, 2, 1};
        //int[] array = {5, 5, 5, 3, 4, 5, 5, 5};
        //int[] array = {5, 5, 5, 5, 4, 5, 5, 5};
        //int[] array = {4, 0, 4, 4, 5, 4, 4, 4};

        int count = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] % 3 == 0) {
                count++;
            }
        }

        //создаем второй массив из чисел первого массива кратных 3
        int[] array2 = new int[count];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 3 == 0) {
                array2[index] = array[i];
                index++;
            }
        }
        System.out.println();

        //ищем произведение элементов второго массива (элементов первого массива, кратных 3)
        int mult = 1;
        for (int i = 0; i < array2.length; i++) {
            mult = mult * array2[i];
        }
        if (mult == 1) {
            System.out.println("Array has not any multiple of 3");
        } else {
            System.out.print("Result of multiplication of multiples of 3: ");
            System.out.println(mult);
        }
    }
}