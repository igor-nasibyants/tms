package com.tms.homework.han.task1;

//        Найти среднее арифметическое элементов с нечетными номерами

public class Task2Advanced {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int sum = 0;
        int count = 0;
        System.out.print("Массив: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
            if (i % 2 != 0) {
                sum += arr[i];
                count++;
            }
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Среднее арифмитическре элементов с нечетными номерами: " + sum / count);
    }
}
