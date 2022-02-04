package com.tms.homework.nnazarv.task1;


import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {

        int[] arr1 = new int[5];
        int[] arr2 = new int[5];
        int sumarr1 = 0;
        int sumarr2 = 0;

        for (int i = 0; i <= arr1.length - 1; i++ ){
            arr1[i] = (int) (Math.random() * 15);
            arr2[i] = (int) (Math.random() * 15);
        }

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        for (int i = 0; i < 5; i++){
            sumarr1 += arr1[i];
            sumarr2 += arr2[i];
        }
        sumarr1 /= arr1.length;
        sumarr2 /= arr2.length;

        if (sumarr1>sumarr2){
            System.out.println("Ср.арифметическое первого массива " + sumarr1 + " больше чем ср.арифметическое второго массива "  + sumarr2);
        } else if (sumarr2>sumarr1){
            System.out.println("Ср.арифметическое второго массива " + sumarr2+ " больше чем ср.арифметическое первого массива " + sumarr1);

        } else{
            System.out.println("Ср.арифметические массивов равны " + sumarr1 + "=" + sumarr2);
        }

    }


}
