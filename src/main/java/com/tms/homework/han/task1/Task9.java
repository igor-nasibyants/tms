package com.tms.homework.han.task1;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstArrSum = 0;
        int secondArrSum = 0;
        System.out.println("Введите положительное число");
        int numbersOfArray = scanner.nextInt();
        while (numbersOfArray < 0) {
            System.out.println("Вы ввели отрицательное число!!! Попробуйте еще раз");
            numbersOfArray = scanner.nextInt();
        }
        int[] arr = new int[numbersOfArray];
        System.out.print("Полученный массив: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ((int) (Math.random() * 15));
            System.out.print(arr[i] + " ");
            if (i < arr.length / 2) {
                firstArrSum += arr[i];
            } else {
                secondArrSum += arr[i];
            }
        }
        System.out.println();
        System.out.println(firstArrSum > secondArrSum ? "Сумма чисел в левой части больше" : "Сумма чисел в правой части больше");
    }
}
