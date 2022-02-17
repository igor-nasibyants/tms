package com.tms.homework.nnazarv.task1.task4;


public class Task4 {
    public static void main(String[] args) {
        int[] arr = new int[20];

        for (int i = 0; i <= arr.length - 1; i++){
            int random_number = (int) (Math.random() * 20);
            arr[i] = random_number;
            System.out.print(arr[i] + " ");

        }

        for (int i = 0; i <= arr.length - 1; i++){
            if (i % 2 ==1){
                arr[i] = 0;
            }
        }

        System.out.println();

        for (int i = 0; i <= arr.length - 1; i++){
            System.out.print(arr[i] + " ");
        }

    }
}
