package com.tms.homework.han.task1;

//        Найти максимальный элемент в массиве и поменять его местами с нулевым
//        элементом

public class Task10Advanced {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int maxNumber = Integer.MIN_VALUE;
        int indexMax = 0;
        System.out.print("Начальный массив: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ((int) (Math.random() * 10));
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxNumber) {
                maxNumber = arr[i];
                indexMax = i;
            }
        }
        arr[indexMax] = arr[0];
        arr[0] = maxNumber;
        System.out.print("Полученный массив: ");
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
