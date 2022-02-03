package com.tms.homework.pavelgrigoryev.task4;

public class FourthTask {
    public static void main(String[] args) {
        swim();
    }
    public static void swim(){
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++){
            array[i] = (int)(Math.random() * 20);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < array.length; i++){
            if (array[i] % 2 != 0) {
                array[i] = 0;
            }
            System.out.print(array[i] + " ");
        }
    }
}
