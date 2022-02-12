package com.tms.homework.liudzmilasobaleva.task5;

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    //Начало всех задач:
    // Создаём квадратную матрицу, размер вводим с клавиатуры. Заполняем
    // случайными числами в диапазоне от 0 до 50. Выводим на консоль(в виде
    // матрицы).
    // 1) Почитать сумму четных элементов стоящих на главной диагонали.

    public static void main(String[] args) {
        System.out.println("Please enter matrix size"); //вводим размер квадратной матрицы с клавиатуры
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int n = sc.nextInt();
        System.out.println();

        Integer array[][] = new Integer[n][n];  //создаем квадратную матрицу из случайных чисел от 0 до 50
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = r.nextInt(50);
            }
        }

        for (int i = 0; i < array.length; i++) {   //выводим квадратную матрицу
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        int sum = 0;  //находим сумму четных элементов, стоящих на главной диагонали
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i == j && array[i][j] % 2 == 0) {
                    sum = sum + array[i][j];
                }
            }
        }
        System.out.println("Sum is " + sum);
    }
}