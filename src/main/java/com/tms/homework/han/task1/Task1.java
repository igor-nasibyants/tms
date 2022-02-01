package com.tms.homework.han.task1;

class Task1 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        System.out.println("Вывод в столбик");
        for (int i = 0, j = 2; i < arr.length; i++, j += 2) {
            arr[i] = j;
            System.out.println(arr[i]);
        }
        System.out.println("Вывод в строку");
        for (int key : arr) {
            System.out.print(key + " ");
        }
    }
}