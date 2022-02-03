package com.tms.homework.han.task1;

//        Создайте массив из всех нечётных чисел от 1 до 99, выведите его на экран в
//        строку, а затем этот же массив выведите на экран тоже в строку, но в обратном
//        порядке (99 97 95 93 … 7 5 3 1).

public class Task2 {
    public static void main(String[] args) {
        int[] arr = new int[50];
        System.out.println("Вывод с 1 до 99:");
        for (int i = 0, j = 1; i < arr.length; i++, j += 2) {
            arr[i] = j;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Вывод с 99 до 0:");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
