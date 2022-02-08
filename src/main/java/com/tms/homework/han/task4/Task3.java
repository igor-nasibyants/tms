package com.tms.homework.han.task4;

//        Создайте массив из 15 случайных целых чисел из отрезка [0; 99]. Выведите
//        массив на экран. Подсчитайте сколько в массиве чётных элементов и выведете
//        это количество на экран на отдельной строке.


public class Task3 {
    public static void main(String[] args) {
        int count = 0;
        int[] arr = new int[15];
        System.out.print("Массив: ");
        for (int key : arr) {
            key =  ((int)(Math.random() * 99));
            System.out.print(key + " ");
            if (key % 2 == 0) {
                count++;
            }
        }
        System.out.println();
        System.out.println("Количество четных элементов " + count);
    }
}
