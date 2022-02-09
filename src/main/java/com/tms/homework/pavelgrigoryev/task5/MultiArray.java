package com.tms.homework.pavelgrigoryev.task5;

import java.util.Scanner;

public class MultiArray {
    public static void main(String[] args) {
        int[][] array;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое положительное целое число : ");
        int firstInput = scanner.nextInt();
        System.out.println("Введите второе положительное целое число : ");
        int secondInput = scanner.nextInt();

        while (firstInput < 1 || secondInput < 1) {
            System.err.println("Ошибка!!! Вы ввели не целое положительное число!");
            System.out.println("Введите первое положительное целое число : ");
            firstInput = scanner.nextInt();
            System.out.println("Введите второе положительное целое число : ");
            secondInput = scanner.nextInt();
        }

        array = new int[firstInput][secondInput];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++){
                array[i][j] =(int) (Math.random() * 50);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
