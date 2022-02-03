package com.tms.homework.liudzmilasobaleva.task1;

public class Task8Ad {
    public static void main(String[] args) {

//8) найти второй по величине (т.е. следующий по величине за максимальным) элемент в массиве
        int[] array = {53, 5, 8, 54, 8, 10, 11};
        //int[] array = {49, 50, 8, 54, 8, 10, 11};
        //int[] array = {1, 2, 3, 4, 5};
        //int[] array = {5, 4, 3, 2, 1};
        //int[] array = {1, 9, 8, 9, 6, 5, 4, 3, 2, 1};
        //int[] array = {5, 5, 5, 3, 4, 5, 5, 5};
        //int[] array = {5, 5, 5, 5, 4, 5, 5, 5};
        //int[] array = {4, 4, 4, 4, 5, 4, 4, 4};
        int max = array[0];
        int secondMax = max;

        int i = 0;
        while (i < array.length - 1) {
            i++;
            int x = array[i];
            if (max == secondMax) {
                if (x > max) {
                    max = x;
                } else {
                    secondMax = x;
                }
            } else if (x > max) {
                secondMax = max;
                max = x;
            } else if (x < max && x > secondMax) {
                secondMax = x;
            }
        }
        System.out.println("===================");
        System.out.println("                   ");
        System.out.println("Second max is " + secondMax);
        System.out.println("                   ");
        System.out.println("===================");
    }

}
