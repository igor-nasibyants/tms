package com.tms.homework.liudzmilasobaleva.task1;

import java.util.Random;

public class Task8 {
    //8)Создайте два массива из 10 целых случайных чисел из отрезка [0;9] и третий
    //массив из 10 действительных чисел. Каждый элемент с i-ым индексом третьего
    //массива должен равняться отношению элемента из первого массива с i-ым
    //индексом к элементу из второго массива с i-ым индексом. Вывести все три
    //массива на экран (каждый на отдельной строке), затем вывести количество
    //целых элементов в третьем массиве.

    public static void main(String[] args) {

        System.out.println("=======================================================================================");
        System.out.print("Array1: ");    //создаем первый массив целых чисел от 0 до 9
        Random r1 = new Random();
        int[] array1 = new int[10];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = r1.nextInt(9);
            System.out.print(array1[i] + " ");
        }
        System.out.println();

        System.out.print("Array2: ");   //создаем второй массив целых чисел от 1 до 9, т.к. на 0 делить нельзя
        Random r2 = new Random();
        int[] array2 = new int[10];
        for (int i = 0; i < array2.length; i++) {
            int min = 1;
            int max = 9;
            int diff = max - min;
            array2[i] = r2.nextInt(diff + 1);
            array2[i] += min;
            System.out.print(array2[i] + " ");
        }
        System.out.println();

        System.out.print("Array3: ");   //создаем третий массив действительных чисел
        double[] array3 = new double[10];
        for (int i = 0; i < array3.length; i++) {
            array3[i] = (double) array1[i] / (double) array2[i];
            System.out.print(array3[i] + " ");
        }
        System.out.println();

        System.out.print("Number of integers: "); // считаем количество целых чисел в третьем массиве
        int count = 0;
        for (int i = 0; i < array3.length; i++) {
            if (Math.floor(array3[i]) == array3[i]) {
                count++;
            }
        }
        System.out.print(count);
        System.out.println();
        System.out.println("=======================================================================================");
    }
}