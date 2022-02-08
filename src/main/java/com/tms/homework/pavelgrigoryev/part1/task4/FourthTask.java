package com.tms.homework.pavelgrigoryev.part1.task4;

public class FourthTask {
    public static void main(String[] args) {
        swim();
    }
    public static void swim(){
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++){
            array[i] = ((int)(Math.random() * 20) + 1);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        int minValue = array[0];
        for (int j : array) {
            if (j % 2 != 0) {
                if (j <= minValue) {
                    minValue = j;
                }
            }
        }
        System.out.println("Наименьший нечетный элемент равен " + minValue);
        for (int i = 0; i < array.length; i++){
            if (array[i] % 2 != 0) {
                array[i] = 0;
            }
            System.out.print(array[i] + " ");
        }
    }
}
