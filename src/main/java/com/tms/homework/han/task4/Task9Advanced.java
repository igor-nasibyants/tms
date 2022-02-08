package com.tms.homework.han.task4;

//      Найти наименьший элемент среди элементов с четными индексами массива

public class Task9Advanced {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int min = Integer.MAX_VALUE;
        System.out.print("Полученный массив: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ((int) (Math.random() * 10));
            System.out.print(arr[i] + " ");
            if (i % 2 == 0 && min >= arr[i]) {
                min = arr[i];
            }
        }
        System.out.println();
        System.out.println("Наименьший элемент в массиве: " + min);
    }
}
