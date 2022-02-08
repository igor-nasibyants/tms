package com.tms.homework.pavelgrigoryev.part1.task7;

public class SeventhTask {
    public static void main(String[] args) {
        go();
    }
    public static void go() {
        int[] array = new int[12];
        int maxValue = 0;
        int lastIndex = 0;
        int num = 5;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 15);
            System.out.print(array[i] + " ");
           if (maxValue <= array[i]) {
               maxValue = array[i];
               lastIndex = i;
           }
           if (array[i] == num){
               count++;
           }
        }
        System.out.println();
        System.out.println(maxValue + " Является макисимальным элементом массива");
        System.out.println(lastIndex + " Index его последнего вхождения в массив");
        System.out.println(num + " встречается " + count + " раз(а)");
    }
}