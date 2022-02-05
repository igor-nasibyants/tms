package com.tms.homework.ArtsiomVladykouski.Task3;

import java.util.Random;


public class MyTask3 {
    public static void main(String[]args){
        //3)Создайте массив из 15 случайных целых чисел из отрезка [0; 99]. Выведите массив на экран.
        // Подсчитайте сколько в массиве чётных элементов и выведете
        // это количество на экран на отдельной строке.
        Random sc= new Random();

        Integer [] arrays=new Integer[15];
        int i=0;
        int count=0;
        for (i=0;i<15;i++) {
            arrays[i] = sc.nextInt(99);
            System.out.print(" " + arrays[i] + " ");
        if (arrays [i]%2==0){
            count++;
        }
        }
            System.out.println("  ");
            System.out.println("  ");
            System.out.print("Количество четных чисел элементов ");
            System.out.println(+count);
    }
    }



