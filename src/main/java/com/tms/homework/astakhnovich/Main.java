package com.tms.homework.astakhnovich;


import com.tms.homework.astakhnovich.task3.TwoDimArray;

public class Main {
    public static void main(String[] args) {
        task1();
        oneDimArray();
        twoDimArray();
    }

    public static void task1() {
//        Task1.BinaryOperations();
    }

    public static void oneDimArray() {
//        OneDimArray.taskOne();
//        OneDimArray.taskTwo();
//        OneDimArray.taskThree();
    }

    public static void twoDimArray() {
        TwoDimArray twoDimArray = new TwoDimArray();
        twoDimArray.gettingNumber();
        twoDimArray.arrayFilling();
        twoDimArray.printTwoDimArray();
        twoDimArray.sumEvenElementsMainDiagonal();
        twoDimArray.elementsBelowMainDiagonal();
        twoDimArray.matrixTransposition();

    }
}
