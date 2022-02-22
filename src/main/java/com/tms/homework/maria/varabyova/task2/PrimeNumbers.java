package com.tms.homework.maria.varabyova.task2;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        try (Scanner tru = new Scanner(System.in)) {
            int number;
            System.out.println("Enter number");

            for (int i = 2; i <= 100; i++) {
                boolean isPrime = i > 2;
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime)
                    System.out.println(i);
            }

        }
    }
}
