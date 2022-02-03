package com.tms.homework.han.task1;

//        Проверить, различны ли все элементы массива

public class Task6Advanced {
    public static void main(String[] args) {
        int[] arr = new int[5];
        String output = "В массиве все элементы различны";
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ((int) (Math.random() * 15));
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            int repeatNumber = arr[i];
            for (int j = 0; j < arr.length; j++) {
                if (i != j && repeatNumber == arr[j]) {
                    output = "В массиве есть повтор(ы)";
                }
            }
        }
        System.out.println(output);
    }
}
