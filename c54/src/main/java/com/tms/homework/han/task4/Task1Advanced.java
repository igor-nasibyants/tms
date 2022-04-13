package com.tms.homework.han.task4;

//      Найти произведение элементов, кратных 3

public class Task1Advanced {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int mul = 1;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
            if (arr[i] % 3 == 0 && arr[i] != 0) {
                mul *= i;
            }
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Произведение чисел, кратных 3 в отрезке [0;" + arr.length + "]: " + mul);
    }
}