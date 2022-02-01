package com.tms.homework.han.task1;

public class Task5 {
    public static void main(String[] args) {
        int[] firstArr = new int[5];
        int[] secondArr = new int[5];
        System.out.print("Первый массив: ");
        double firstMean = getMean(firstArr);
        System.out.print("Второй массив: ");
        double secondMean = getMean(secondArr);
        if (firstMean > secondMean) {
            System.out.println("Среднее значение первого массива больше");
        } else if (firstMean < secondMean) {
            System.out.println("Среднее значение второго массива больше");
        } else {
            System.out.println("Массивы равны");
        }
    }

    public static double getMean(int[] arr) {
        int sumFirst = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ((int) (Math.random() * 15));
            sumFirst += arr[i];
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        return (double) sumFirst / arr.length;
    }
}
