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

        while (n <= 3) {                  //проверяем, подходит ли число
            {
                System.out.println("Please enter a number greater than 3");
            }
            n = sc.nextInt();
        }

        int array1[] = new int[n];         //если число подходит, выводим первый массив
        System.out.print("Your array is: ");
        for (int i = 0; i < n; i++) {
            array1[i] = r.nextInt(n);
            System.out.print(array1[i] + " ");
        }
        System.out.println();

        int count = 0;                   //считаем размер второго массива (количество четных чисел первого)
        for (int i = 0; i < n; i++) {
            if (array1[i] % 2 == 0) {
                count++;
            }
        }

        System.out.print("Your even numbers array is: "); //выводим массив из четных чисел первого массива
        int array2[] = new int[count];
        for (int i = 0; i < n; i++) {
            if (array1[i] % 2 == 0) {
                int j = 0;
                array2[j] = array1[i];
                System.out.print(array2[j] + " ");
            }
        }
        System.out.println();
        System.out.println("============================================================================");
    }
}