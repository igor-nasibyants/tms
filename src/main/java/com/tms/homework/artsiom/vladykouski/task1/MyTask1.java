package com.tms.homework.artsiom.vladykouski.task1;

public class MyTask1 {
    public static void main(String[] args) {
        // 1)Создайте массив из всех чётных чисел от 2 до 20 и выведите
        // элементы массива на экран сначала в строку, отделяя один элемент
        // от другого пробелом, а затем в столбик (отделяя один элемент от другого
        // началом новой строки). Перед созданием массива подумайте, какого он будет размера.
        int[] arrays = new int[10];
        int i, j;
        for (i = 0, j = 2; i < arrays.length & j <= 20; i++, j += 2) {
            arrays[i] = j;
            System.out.print(arrays[i] + " ");
        }
        System.out.println();
        for (int d : arrays) {
            System.out.println(d + " ");
        }

    }
}

