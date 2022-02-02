package com.tms.homework.astakhnovich.task3;

import java.util.Scanner;

public class TwoDimArray {

    public static void TaskOne(){
        Scanner scan = new Scanner(System.in);
        int [][] twoDimArray = new int [scan.nextInt()][scan.nextInt()];
        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                System.out.print(" " + twoDimArray[i][j] + " ");
            }
            System.out.println();
        }
    }

}
