package com.tms.homework.liudzmilasobaleva.task1;

public class Task2 {
    // 2)Создайте массив из всех нечётных чисел от 1 до 99, выведите его на экран в
    // строку, а затем этот же массив выведите на экран тоже в строку, но в обратном
    // порядке (99 97 95 93 … 7 5 3 1).
    public static void main(String[] args) {
        int[] array = new int[50];
        array[0] = 1;
        for (int i = 0; i < array.length - 1; i++) {
            array[i + 1] = array[i] + 2;
        }
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int a = array.length - 1; a >= 0; a--) {
            System.out.print(array[a] + " ");
        }
    }
}
