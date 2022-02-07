package com.tms.homework.artsiom.vladykouski.task2;

import java.util.Arrays;
import java.util.Collections;

public class MyTask2 {
    public static void main(String[] args) {
        //2)Создайте массив из всех нечётных чисел от 1 до 99, выведите его на экран в строку,
        // а затем этот же массив выведите на экран тоже в строку,
        // но в обратном порядке (99 97 95 93 … 7 5 3 1).
        int i, n, b;
// Определяем количество нечетных числе для определения размера массива
        int count = 0;
        for (b = 1; b <= 99; b += 2) {
            count++;
            System.out.println(count);
        }
// Создаем массив из нечетных чисел
        Integer[] arrays = new Integer[50];
        for (i = 1, n = 0; i <= 99; i += 2, n++) {
            arrays[n] = i;
        }
// Выводим значения массива в строку
        for (int d : arrays) {
            System.out.print(" " + d + " ");
        }
        System.out.println();
        System.out.println();
// Соритруем массив по убыванию
        Arrays.sort(arrays, Collections.reverseOrder());
        for (int v : arrays) {
            System.out.print(" " + v + " ");
        }
    }
}
