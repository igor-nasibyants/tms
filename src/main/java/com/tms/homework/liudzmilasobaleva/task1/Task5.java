package com.tms.homework.liudzmilasobaleva.task1;

import java.util.Random;

public class Task5 {

    //5)Создайте 2 массива из 5 случайных целых чисел из отрезка [0;15] каждый,
    //выведите массивы на экран в двух отдельных строках. Посчитайте среднее
    //арифметическое элементов каждого массива и сообщите, для какого из
    //массивов это значение оказалось больше (либо сообщите, что их средние
    //арифметические равны).

    public static void main(String[] args) {
        Random r1 = new Random(); //create array1
        Integer array1[] = new Integer[5];
        int sum1 = 0;
        System.out.print("Array1: ");
        for (int i = 0; i < array1.length; i++) {
            array1[i] = r1.nextInt(15);
            System.out.print(array1[i] + " ");
            sum1 += array1[i];
        }
        System.out.println();
        double am1 = (double) sum1 / array1.length;
        System.out.println("Arithmetical mean1 is " + am1);

        Random r2 = new Random();
        Integer array2[] = new Integer[5];
        int sum2 = 0;
        System.out.print("Array2: "); //create array2
        for (int i = 0; i < array2.length; i++) {
            array2[i] = r2.nextInt(15);
            System.out.print(array2[i] + " ");
            sum2 += array2[i];
        }
        System.out.println();
        double am2 = (double) sum2 / array2.length;
        System.out.println("Arithmetical mean2 is " + am2);

        if (am1 > am2) {
            System.out.println("Result: arithmetical mean1 is greater than arithmetical mean2");
        } else if (am1 < am2) {
            System.out.println("Result: arithmetical mean1 is less than arithmetical mean2");
        } else {
            System.out.println("Result: two arithmetic means are equal");
        }
    }
}


