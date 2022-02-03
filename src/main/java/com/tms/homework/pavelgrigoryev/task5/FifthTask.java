package com.tms.homework.pavelgrigoryev.task5;

public class FifthTask {
    public static void main(String[] args) {
        foo();
    }
    public static void foo() {
        int[] firstArray = new int [5];
        int[] secondArray = new int [5];

        double sumFirstArray = 0;
        double sumSecondArray = 0;

        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = (int) (Math.random() * 15);
            System.out.print(firstArray[i] + " ");
            sumFirstArray += firstArray[i];
        }
        System.out.println();
        for (int i = 0; i < secondArray.length; i++) {
            secondArray[i] = (int) (Math.random() * 15);
            System.out.print(secondArray[i] + " ");
            sumSecondArray += secondArray[i];
        }
        System.out.println();
        sumFirstArray /= 5;
        sumSecondArray /= 5;

        if (sumFirstArray > sumSecondArray) {
            System.out.println("Среднее арифметическое значение первого массива  " + sumFirstArray + " > " + sumSecondArray  + " Среднего арифметического значения второго массива");
        } else if (sumFirstArray < sumSecondArray) {
            System.out.println("Среднее арифметическое первого массива  " + sumFirstArray + " < " + sumSecondArray + " Среднего арифметического значения второго массива" );
        } else {
            System.out.println("Средние арифметические массивов равны  " + sumFirstArray );
        }
    }
}
