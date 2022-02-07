package com.tms.homework.artsiom.vladykouski.task5;

import java.util.Random;

public class MyTask5 {
    public static void main(String[] args) {
        //5)Создайте 2 массива из 5 случайных целых чисел из отрезка [0;15] каждый,
        // выведите массивы на экран в двух отдельных строках.
        // Посчитайте среднее арифметическое элементов каждого массива и сообщите,
        // для какого из массивов это значение оказалось больше
        // (либо сообщите, что их средние арифметические равны).
        Random r = new Random();
        int x, y;
        double count1 = 0, count2 = 0;
        Integer[] arrays1 = new Integer[5];
        Integer[] arrays2 = new Integer[5];
        for (x = 0; x < 5; x++) {
            arrays1[x] = r.nextInt(16);
            System.out.print(" " + arrays1[x] + "");
        }
        System.out.println("");
        for (y = 0; y < 5; y++) {
            arrays2[y] = r.nextInt(16);
            System.out.print(" " + arrays2[y] + "");
        }
        System.out.println(" ");
        for (x = 0; x < arrays1.length; x++) {
            count1 = count1 + arrays1[x];
        }
        System.out.println(" ");
        System.out.print("Сумма первого массива =" + count1);
        for (y = 0; y < arrays2.length; y++) {
            count2 = count2 + arrays2[y];
        }
        System.out.println(" ");
        System.out.print("Сумма второго массива =" + count2);
        System.out.println(" ");

        if (count1 / 5 > count2 / 5) {
            System.out.print("Среднее арифметическое массива arrays1 больше");
        } else {
            if (count1 / 5 < count2 / 5) {
                System.out.print("Среднее арифметическое массива arrays2 больше");
            } else {
                System.out.print("Средние арифметические значения массивов равны");
            }
        }
    }
}

