package com.tms.homework.han.task4;

//      Найти средне арифметическое элементов массива, превосходящих некоторое число С

public class Task3Advanced {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int from = 9;
        int sum = 0;
        int count = 0;
        System.out.print("Массив: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ((int) (Math.random() * 15));
            System.out.print(arr[i] + " ");
            if (arr[i] > from) {
                sum += arr[i];
                count++;
            }
        }
        System.out.println();
        System.out.println("Среднее арифметическое значение элементов, превосходщее число " + from + ": " + (double) sum / count);
    }
}
