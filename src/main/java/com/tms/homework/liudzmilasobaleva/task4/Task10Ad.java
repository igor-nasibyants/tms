package com.tms.homework.liudzmilasobaleva.task4;

public class Task10Ad {
    //10) Найти максимальный элемент в массиве и поменять его местами с нулевым
    //элементом

    public static void main(String[] args) {
        //int[] array = {53, 5, 8, 54, 8, 10, 11};
        //int[] array = {49, 50, 8, 54, 8, 10, 11};
        //int[] array = {1, 2, 3, 4, 5};
        //int[] array = {5, 4, 3, 2, 1};
        int[] array = {2, 7, 8, 10, 6, 5, 4, 3, 2, 1};
        //int[] array = {5, 5, 5, 3, 4, 5, 5, 5};
        //int[] array = {5, 4, 5, 4, 5, 4, 5, 4};

        int max = array[0];
        int index = 0;

        for (int i = 0; i < array.length; i++) { //ищем max и сохраняем его индекс
            if (array[i] > max) {
                max = array[i];
                index = i;
            }
        }

        int temp = array[0]; //меняем местами max и нулевой элемент
        array[0] = array[index];
        array[index] = temp;

        System.out.print("After replacement: "); //выводим обновленный массив
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}