package com.tms.homework.han.task1;

//        Найти второй по величине (т.е. следующий по величине за максимальным)
//        элемент в массиве

public class Task8Advanced {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int preLastMaxNumber = Integer.MIN_VALUE;
        int lastMaxNumber = Integer.MIN_VALUE;
        System.out.print("Полученный массив: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ((int) (Math.random() * 10));
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int j : arr) {
            if (j >= lastMaxNumber) {
                lastMaxNumber = j;
            }
        }
        for (int j : arr) {
            if (j >= preLastMaxNumber && j < lastMaxNumber) {
                preLastMaxNumber = j;
            }
        }
        System.out.println("Второе по величине число в массиве: " + preLastMaxNumber);
    }
}
