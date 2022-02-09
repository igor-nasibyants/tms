package com.tms.homework.liudzmilasobaleva.task4;

import java.util.Random;
import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        //10)Пользователь вводит с клавиатуры число большее 3, которое сохраняется в
        //переменную n. Если пользователь ввёл не подходящее число, то программа
        //должна выдать соответствующее сообщение. Создать массив из n случайных
        //целых чисел из отрезка [0;n] и вывести его на экран. Создать второй массив
        //только из чётных элементов первого массива, если они там есть, и вывести его
        //на экран.
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        System.out.println("============================================================================");
        System.out.println("Please enter a number");
        int n = sc.nextInt();

        //проверяем, подходит ли число
        while (n <= 3) {
            {
                System.out.println("Please enter a number greater than 3");
            }
            n = sc.nextInt();
        }

        //если число подходит, выводим первый массив
        int array1[] = new int[n];
        System.out.print("Your array is: ");
        for (int i = 0; i < n; i++) {
            array1[i] = r.nextInt(n);
            System.out.print(array1[i] + " ");
        }
        System.out.println();

        //считаем размер второго массива (количество четных чисел первого)
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (array1[i] % 2 == 0) {
                count++;
            }
        }

        //выводим массив из четных чисел первого массива
        System.out.print("Your even numbers array is: ");
        int array2[] = new int[count];
        int index = 0;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] % 2 == 0) {
                array2[index] = array1[i];
                System.out.print(array2[index] + " ");
                index++;
            }
        }
        System.out.println();
        System.out.println("============================================================================");
    }
}