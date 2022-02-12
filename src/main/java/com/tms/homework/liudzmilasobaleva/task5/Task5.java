package com.tms.homework.liudzmilasobaleva.task5;

import java.util.Random;
import java.util.Scanner;

public class Task5 {
    // Начало всех задач:
    // Создаём квадратную матрицу, размер вводим с клавиатуры. Заполняем
    // случайными числами в диапазоне от 0 до 50. Выводим на консоль(в виде
    // матрицы).
    // 5)Транспонировать матрицу(1 столбец станет 1-й строкой, 2-й столбец - 2-й
    //строкой и т. д.)

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

        //транспонируем матрицу
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                int temp = array[i][j];
                array[i][j] = array[j][i];
                array[j][i] = temp;
            }
        }

        //выводим новую квадратную матрицу
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("=====================================================================================");
    }
}