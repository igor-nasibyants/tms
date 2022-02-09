package com.tms.homework.liudzmilasobaleva.task4;

public class Task6Ad {
    //6) Проверить, различны ли все элементы массива.
    public static void main(String[] args) {
        //int[] array = {53, 5, 8, 54, 8, 10, 11};
        int[] array = {49, 50, 9, 54, 8, 10, 11};
        //int[] array = {1, 2, 3, 4, 5};
        //int[] array = {5, 4, 3, 2, 1};
        //int[] array = {1, 9, 8, 9, 6, 5, 4, 3, 2, 1};
        //int[] array = {5, 5, 5, 3, 4, 5, 5, 5};
        //int[] array = {5, 5, 5, 5, 4, 5, 5, 5};
        //int[] array = {4, 4, 4, 4, 4, 4, 4, 4};

        boolean allDifferent = true;
        int i = 0;
        while (allDifferent && i <= array.length - 2) {
            int j = i + 1;
            while (allDifferent && j <= array.length - 1) {
                if (array[i] == array[j]) {
                    allDifferent = false;
                }
                j++;
            }
            i++;
        }
        if (allDifferent == false) {
            System.out.println("Not all array elements are different");
        } else {
            System.out.println("All array elements are different");
        }
    }
}