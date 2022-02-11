package com.tms.homework.artsiom.vladykouski.task4.OneDimeArrays;

import java.util.Random;

public class MyTask7 {
    public static void main(String[] args) {
        //7)Создайте массив из 12 случайных целых чисел из отрезка [0;15].
        // Определите какой элемент является в этом массиве максимальным
        // и сообщите индекс его последнего вхождения в массив.
        Random r = new Random();
        int i, j = 0;
        int max = 0;
        Integer[] arrays = new Integer[12];
        for (i = 0; i < 12; i++) {
            arrays[i] = r.nextInt(16);
            System.out.print(" " + arrays[i] + " ");
        }
        System.out.println("");
        for (i = 0; i < arrays.length-1; i++) {
            if (arrays[i] >= arrays[i+1]) {
                max = i;

            }
        }
        System.out.print("индекс вхождения в массив = " + max + " ");
    }
}