package com.tms.homework.liudzmilasobaleva.task5;

import java.util.Random;
import java.util.Scanner;

public class Task4 {

    // Начало всех задач:
    // Создаём квадратную матрицу, размер вводим с клавиатуры. Заполняем
    // случайными числами в диапазоне от 0 до 50. Выводим на консоль(в виде
    // матрицы).
    // 4)Посчитать сумму четных элементов стоящих над побочной диагональю
    // (не включительно)

    public static void main(String[] args) {

        System.out.println("=====================================================================================");
        System.out.println("Enter size of square matrix"); //вводим размер квадратной матрицы с клавиатуры
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int n = sc.nextInt();
        System.out.println();

        //создаем квадратную матрицу из случайных чисел от 0 до 50
        int array[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = r.nextInt(50);
            }
        }

        //выводим квадратную матрицу
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        //находим сумму четных элементов над побочной диагональю
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[i][j] % 2 == 0) {
                    sum = sum + array[i][j];
                }
            }
        }
        System.out.println("sum is " + sum);
        System.out.println("=====================================================================================");
    }
}