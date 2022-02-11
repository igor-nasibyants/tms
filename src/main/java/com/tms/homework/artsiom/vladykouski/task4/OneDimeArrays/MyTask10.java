package com.tms.homework.artsiom.vladykouski.task4.OneDimeArrays;
import java.util.Scanner;
import java.util.Random;

public class MyTask10 {
    // 10)Пользователь вводит с клавиатуры число большее 3, которое сохраняется в переменную n.
    // Если пользователь ввёл не подходящее число, то программа должна выдать соответствующее сообщение.
    // Создать массив из n случайных целых чисел из отрезка [0;n] и вывести его на экран.
    // Создать второй массив только из чётных элементов первого массива, если они там есть,
    // и вывести его на экран.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int i, j = 0, a = 0;
        int n = sc.nextInt();
        if (n > 3) {
            int[] arrays1 = new int[n];
            for (i = 0; i < arrays1.length; i++) {
                arrays1[i] = r.nextInt(n + 1);
            }
            for (int d : arrays1) {
                System.out.print(" " + d + " ");
            }
            System.out.println();
            System.out.println();
            int count = 0;
            for (i = 0; i < arrays1.length; i++) {
                if (arrays1[i] % 2 == 0 & arrays1[i] != 0) {
                    count++;
                }
            }
            System.out.print(" " + count + " ");
            System.out.println();
            System.out.println();
            int[] arrays2 = new int[count];
            for (i = 0; i < arrays1.length; i++) {
                if (arrays1[i] % 2 == 0 & arrays1[i] != 0) {
                    arrays2[j] = arrays1[i];
                    System.out.print(" " + arrays2[j] + " ");
                }
            }
        }
        else {
            System.out.print("Неподходящее число");
        }
    }
}
