package com.tms.homework.han.task1;

//        Создайте массив из 12 случайных целых чисел из отрезка [0;15]. Определите
//        какой элемент является в этом массиве максимальным и сообщите индекс его
//        последнего вхождения в массив.


public class Task7 {
    public static void main(String[] args) {
        int[] arr = new int[12];
        int maxValueIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ((int) (Math.random() * 15));
        }
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] >= arr[i + 1]) {
                maxValueIndex = i;
            }
        }
        System.out.println("Максимальное значение в массиве находится по индексу: " + maxValueIndex );
    }
}
