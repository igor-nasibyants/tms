package com.tms.homework.maria.varabyova.task5;

import java.util.Random;
import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        System.out.println("Введите размерность матрицы");
        Scanner sc =new Scanner(System.in);
        Random r=new Random();
        int n;
        n=sc.nextInt();

        int mass[][]=new int[n][n];

        for(int i=0;i<n; i++){
            for(int j=0;j<n;j++){
                mass[i][j]=r.nextInt(9);
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(mass[i][j]+" ");
            }
            System.out.println();
        }
    }
}
