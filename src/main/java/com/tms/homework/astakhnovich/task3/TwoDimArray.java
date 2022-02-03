package com.tms.homework.astakhnovich.task3;

import java.util.Random;
import java.util.Scanner;

public class TwoDimArray {
    Integer matrixSize;
    Integer[][] twoDimArray;

    public void gettingNumber() {
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Please enter a positive number!");
            while (!scan.hasNextInt()) {
                System.out.println("That not a number!");
                scan.next();
            }
            matrixSize = scan.nextInt();
        } while (matrixSize <= 0);
        twoDimArray = new Integer[matrixSize][matrixSize];
    }

    public void arrayFilling() {
        Random randomNumber = new Random();
        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                twoDimArray[i][j] = randomNumber.nextInt(50);
            }
        }
    }

    public void printTwoDimArray() {
        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                System.out.print(twoDimArray[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("---------------------------------------");
    }

    public void sumEvenElementsMainDiagonal() {
        Integer sum = 0;
        for (int i = 0; i < twoDimArray.length; i++) {
            sum += twoDimArray[i][i];
        }
        System.out.println("the sum of the even elements of the main diagonal = " + sum);
        System.out.println("---------------------------------------");
    }

    public void elementsBelowMainDiagonal() {
        Integer sum = 0;
        for (int i = 1; i < twoDimArray.length; i++) {
            for (int j = 0; j <= i; j++) {
                if (twoDimArray[i][j] % 2 != 0) {
                    System.out.print(twoDimArray[i][j] + " ");
                }
            }
        }
        System.out.println();
        System.out.println("---------------------------------------");
    }

    public void matrixTransposition() {
        for (int i = 0; i < matrixSize; i++) {
            for (int j = i + 1; j < matrixSize; j++) {
                int temp = twoDimArray[i][j];
                twoDimArray[i][j] = twoDimArray[j][i];
                twoDimArray[j][i] = temp;
            }
        }
        printTwoDimArray();
    }
}
