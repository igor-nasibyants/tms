package com.tms.homework.nikitaelenski.task5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
        System.out.println("Введите длинну матрицы");
        int LongArray = scan.nextInt();
        System.out.println("Введите ширину матрицы ");
        int WithArray = scan.nextInt();
        int[][] array = new int [LongArray][WithArray];
        TwoDimensionalArrays.MatrixPrintout(array);
        TwoDimensionalArrays.SummArray(array);
        TwoDimensionalArrays.DiagonalProduct(array);
    }
}
