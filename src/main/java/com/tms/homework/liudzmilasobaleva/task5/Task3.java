package com.tms.homework.liudzmilasobaleva.task5;

import java.util.Random;
import java.util.Scanner;

public class Task3 {

    //Начало всех задач:
    //Создаём квадратную матрицу, размер вводим с клавиатуры. Заполняем
    //случайными числами в диапазоне от 0 до 50. Выводим на консоль(в виде
    //матрицы).
    //3)Проверить произведение элементов какой диагонали больше.

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

        //находим произведение элементов главной диагонали
        long mul1 = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i == j) {
                    mul1 = mul1 * array[i][j];
                }
            }
        }
        System.out.println(mul1 + " - product of elements of the main diagonal");

        //находим произведение элементов побочной диагонали
        long mul2 = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - 1 - i; j >= 0; j--) {
                mul2 = mul2 * array[i][j];
                break;
            }
        }
        System.out.println(mul2 + " - product of elements of the secondary diagonal");

        //сравниваем произведения двух дигоналей и выводим результат
        if (mul1 > mul2) {
            System.out.println("The product of elements of the main diagonal is greater");
        }
        if (mul2 > mul1) {
            System.out.println("The product of elements of the secondary diagonal is greater");
        }
        if (mul1 == mul2) {
            System.out.println("The products of both diagonals are equal");
        }
        System.out.println("=====================================================================================");
    }
}