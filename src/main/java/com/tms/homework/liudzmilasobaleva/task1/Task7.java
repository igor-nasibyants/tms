package com.tms.homework.liudzmilasobaleva.task1;

import java.util.Random;

public class Task7 {

    //7)Создайте массив из 12 случайных целых чисел из отрезка [0;15]. Определите
    // какой элемент является в этом массиве максимальным и сообщите индекс его
    // последнего вхождения в массив.

    public static void main(String[] args) {
        System.out.print("Array: ");
        Random r = new Random();
        Integer[] array = new Integer[12];

        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(15);
            System.out.print(array[i] + " ");
        }
        System.out.println();

        int max = array[0]; //ищем max и его индекс
        int indexMax = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= max) {
                max = array[i];
                indexMax = i;
            }
        }
        System.out.println("Max is " + max);
        System.out.println("Last Max index is " + indexMax);
        System.out.println();
    }
}

