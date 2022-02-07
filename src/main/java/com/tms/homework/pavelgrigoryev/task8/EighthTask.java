package com.tms.homework.pavelgrigoryev.task8;

public class EighthTask {
    public static void main(String[] args) {
        int[] firstArray = new int[10];
        int[] secondArray = new int[10];
        double[] thirdArray = new double[10];
        int count = 0;
        int max = firstArray[0];
        int secondMax = firstArray[0];

        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = (int)(Math.random() * 9 + 1);
            secondArray[i] = (int)(Math.random() * 9 + 1);
            thirdArray[i] = (double) firstArray[i] / secondArray[i];
            System.out.print(firstArray[i] + " ");
            if (firstArray[i] > max) {
                secondMax = max;
                max = firstArray[i];
            } else if (firstArray[i] > secondMax) {
                secondMax = firstArray[i];
            }
        }
        System.out.println();
        for (int j : secondArray) {
            System.out.print(j + " ");
        }
        System.out.println();
        for (double v : thirdArray) {
            System.out.print(v + " ");
            if (v % 1 == 0) {
                count++;
            }
        }
        System.out.println();
        System.out.println("Количество целых элементов в третьем массиве равно " + count);
        System.out.println(max + " Первый по величине элемент первого массива");
        System.out.println(secondMax + " Второй по величине элемент первого массива");
    }
}
