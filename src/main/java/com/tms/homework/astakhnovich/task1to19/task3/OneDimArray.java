package com.tms.homework.astakhnovich.task1to19.task3;

import java.util.Random;

public class OneDimArray {

    public void taskOne() {
        Integer[] evenNumbers = new Integer[10];
        Integer count = 0;
        for (int i = 2; i <= 20; i++) {
            if (i % 2 == 0) {
                evenNumbers[count] = i;
                count++;
            }
        }
        outputToLine(evenNumbers);
        outputToColumn(evenNumbers);
    }

    public void taskTwo() {
        Integer[] oddNumbers = new Integer[50];
        Integer count = 0;
        for (int i = 1; i <= 99; i++) {
            if (i % 2 != 0) {
                oddNumbers[count] = i;
                count++;
            }
        }
        outputToLine(oddNumbers);
        reverseOutputToLine(oddNumbers);
    }

    public void taskThree() {
        Random randomNumber = new Random();
        Integer[] arrayRandomNumbers = new Integer[15];
        Integer count = 0;
        for (int i = 0; i < arrayRandomNumbers.length; i++) {
            arrayRandomNumbers[i] = randomNumber.nextInt(99);
            if (arrayRandomNumbers[i] % 2 == 0) {
                count++;
            }
        }
        outputToLine(arrayRandomNumbers);
        System.out.println("кол-во четных элементов : " + count);
    }

    public static void outputToLine(Integer[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void outputToColumn(Integer[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println();
    }

    public static void reverseOutputToLine(Integer[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
