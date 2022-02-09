package com.tms.homework.liudzmilasobaleva.task4;

public class Task4Ad {
    //4) Найти наименьший нечетный элемент.
    public static void main(String[] args) {
        int[] array = {53, 5, 8, 54, 8, 10, 11};
        //int[] array = {49, 50, 9, 54, 8, 10, 11};
        //int[] array = {1, 2, 3, 4, 5};
        //int[] array = {5, 4, 3, 2, 1};
        //int[] array = {1, 9, 8, 9, 6, 5, 4, 3, 2, 1};
        //int[] array = {5, 5, 5, 3, 4, 5, 5, 5};
        //int[] array = {5, 5, 5, 5, 4, 5, 5, 5};
        //int[] array = {4, 0, 4, 4, 5, 4, 4, 4};

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                count++;
            }
        }

        //создаем второй массив из нечетных элементов первого массива
        int[] array2 = new int[count];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                array2[index] = array[i];
                index++;
            }
        }
        System.out.println();

        //выводим нечетные элементы первого массива
        System.out.print("Second array: ");
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }
        System.out.println();

        //находим наименьший элемент
        System.out.print("Smallest odd element is ");
        int min = array2[0];
        for (int i = 0; i < array2.length; i++) {
            if (array2[i] < min) {
                min = array2[i];
            }
        }
        System.out.print(min);
    }
}