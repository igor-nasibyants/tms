package com.tms.homework.artsiom.vladykouski.task4.OneDimeArrays;

import java.util.Random;


public class MyTask8 {
    public static void main(String[] args) {
        //8)Создайте два массива из 10 целых случайных чисел из отрезка [0;9]
        // и третий массив из 10 действительных чисел. Каждый элемент с i-ым индексом
        // третьего массива должен равняться отношению элемента из первого массива с i-ым
        // индексом к элементу из второго массива с i-ым индексом. Вывести все три массива
        // на экран (каждый на отдельной строке), затем вывести количество целых элементов в третьем массиве.
        Random r = new Random();
        int[] arrays1 = new int[10];
        int[] arrays2 = new int[10];
        double[] arrays3 = new double[10];
        int i;
        int count = 0;
        for (i = 0; i < 10; i++) {
            arrays1[i] = r.nextInt(10);
            System.out.print(" " + arrays1[i] + " ");
        }
        System.out.println(" ");
        for (i = 0; i < 10; i++) {
            arrays2[i] = r.nextInt(10);
            System.out.print(" " + arrays2[i] + " ");
        }
        System.out.println(" ");
        for (i = 0; i < 10; i++) {
            if (arrays2[i] != 0) {
                arrays3[i] = (double) arrays1[i] / arrays2[i];
                arrays3[i] = (double) Math.round(arrays3[i] * 100) / 100;
            } else {
                arrays3[i] = 0;
            }
            System.out.print(" " + arrays3[i] + " ");
        }
        System.out.println(" ");
        for (double d : arrays3) {
            if (d % 1 == 0) {
                count++;
            }
        }
        System.out.print(" " + count + " ");
    }
}
