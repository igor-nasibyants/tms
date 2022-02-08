package com.tms.homework.liudzmilasobaleva.task4;

import java.util.Random;

public class Task6 {

    // 6)Создайте массив из 4 случайных целых чисел из отрезка [0;10], выведите его
    //на экран в строку. Определить и вывести на экран сообщение о том, является ли
    //массив строго возрастающей последовательностью.
    public static void main(String[] args) {
        Integer[] array = new Integer[4];
        Random r = new Random();
        System.out.print("Array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(10);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        boolean strictlyIncreasingSequence = true;
        int i = 0;
        while (strictlyIncreasingSequence == true && i < array.length - 1) {
            if (array[i] >= array[i + 1]) {
                strictlyIncreasingSequence = false;
                System.out.println("not strictly increasing sequence");
            }
            i++;
        }
        if (strictlyIncreasingSequence == true) {
            System.out.println("strictly increasing sequence");
        }
    }
}

