package com.tms.homework.artsiom.vladykouski.task4.OneDimeArrays;

import java.util.Random;

public class MyTask4 {
    public static void main(String[] args) {
        //4)Создайте массив из 20 случайных целых чисел из отрезка [0;20]. Выведите массив на экран в строку.
        // Замените каждый элемент с нечётным индексом на ноль.
        // Снова выведете массив на экран на отдельной строке.
        Random r = new Random();
        Integer[] arrays = new Integer[20];
        int i;
        for (i = 0; i < 20; i++) {
            arrays[i] = r.nextInt(21);
            System.out.print(" " + arrays[i] + " ");
            if (i % 2 != 0) {
                arrays[i] = 0;
            }
        }
        System.out.println(" ");
        System.out.println(" ");
        for (int d : arrays) {
            System.out.print(" " + d + " ");
        }
    }
}


