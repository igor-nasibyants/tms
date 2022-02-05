package com.tms.homework.liudzmilasobaleva.task1;

import java.util.Random;

public class Task3 {

    //3)Создайте массив из 15 случайных целых чисел из отрезка [0; 99]. Выведите
    //массив на экран. Подсчитайте сколько в массиве чётных элементов и выведете
    //это количество на экран на отдельной строке.
    public static void main(String[] args) {
        Random r = new Random();
        Integer array[] = new Integer[15];
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(99);
        }
        System.out.println("=====================================================");
        System.out.println("                                                     ");
        System.out.print("Array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.print("Even numbers: ");
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                count++;
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
        System.out.println("Number of even numbers: " + count);
        System.out.println("                                                     ");
        System.out.println("=====================================================");
    }
}


