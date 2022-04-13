package com.tms.homework.han.task4;

//        Создайте массив из всех чётных чисел от 2 до 20 и выведите элементы
//        массива на экран сначала в строку, отделяя один элемент от другого пробелом, а
//        затем в столбик (отделяя один элемент от другого началом новой строки). Перед
//        созданием массива подумайте, какого он будет размера.

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