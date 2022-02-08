package com.tms.homework.han.task4;

//    Подсчитать, сколько раз встречается элемент с заданным значением

public class Task7Advanced {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int checkNumber = 2;
        int count = 0;
        System.out.print("Полученный массив: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ((int) (Math.random() * 4));
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int key : arr) {
            if (key == checkNumber) {
                count++;
            }
        }
        System.out.println("Значение " + checkNumber + " встречается " + count + " раз");
    }
}
