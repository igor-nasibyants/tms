package com.tms.homework.pavelgrigoryev.task10;

import java.util.Scanner;

public class TenthTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int secondCount = 0;
        System.out.println("Введите число больше 3 ");
        int n = scanner.nextInt();
        while (n <= 3) {
            System.out.println("Ошибка! Введите число больше 3 ");
            n = scanner.nextInt();
        }
        int[] firstArray = new int[n];
        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = (int) (Math.random() * (n + 1));
            System.out.print(firstArray[i] + " ");
            if (firstArray[i] % 2 == 0) {
                count++;
            }
        }
        System.out.println();
        if (count > 0) {
            int[] secondArray = new int[count];
            for (int j : firstArray) {
                if (j % 2 == 0) {
                    secondArray[secondCount] = j;
                    System.out.print(secondArray[secondCount] + " ");
                }
            }
        }
    }
}
