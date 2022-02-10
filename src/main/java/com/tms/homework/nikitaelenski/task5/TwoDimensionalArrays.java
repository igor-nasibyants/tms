package com.tms.homework.nikitaelenski.task5;

public class TwoDimensionalArrays {
    public static void MatrixPrintout (int array [][]){
        int k = 1;
        for(int i = 0 ; i < array.length ; i++){
            for(int j = 0 ; j < array[i].length ; j ++) {
                array[i][j] = k;
                k++;
            }
        }
        for(int i = 0 ;i < array.length ;i++ ) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
    public static void SummArray (int array [][]){
        int sum = 0;
        for (int i = 0 ; i< array.length;i++){
            for (int j = 0 ; j < array[i].length ; j++){
                if(array[i] == array[j] && array[i][j]%2==0){
                    sum +=array[i][j];
                }
            }
        }
        System.out.println("сумму четных элементов стоящих на главной диагонали " + sum);
    }
}
