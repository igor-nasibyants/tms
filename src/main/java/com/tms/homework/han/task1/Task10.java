package com.tms.homework.han.task1;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countEvenNumbers = 0;
        System.out.println("Введите число, которое больше 3");
        int n = scanner.nextInt();
        while (n < 3) {
            System.out.println("Попробуйте еще раз ввести число большее 3");
            n = scanner.nextInt();
        }
        int[] arr = new int[n];
        System.out.print("Первый массив: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ((int) (Math.random() * n));
            System.out.print(arr[i] + " ");
            if (arr[i] % 2 == 0) {
                countEvenNumbers++;
            }
        }
        System.out.println();
        System.out.print("Второй массив: ");
        if (countEvenNumbers != 0) {
            int[] evenArr = new int[countEvenNumbers];
            for (int i = 0, j = 0; i < arr.length; i++) {
                if (arr[i] % 2 == 0) {
                    evenArr[j] = arr[i];
                    j++;
                }
            }
            for (int key : evenArr) {
                System.out.print(key + " ");
            }
        } else {
            System.out.println("пуст");
        }
    }
}
