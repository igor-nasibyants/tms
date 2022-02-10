package com.tms.homework.astakhnovich;


import com.tms.homework.astakhnovich.task1.Task1;
import com.tms.homework.astakhnovich.task3.OneDimArray;
import com.tms.homework.astakhnovich.task3.TwoDimArray;
import com.tms.homework.astakhnovich.task6.Essence;
import com.tms.homework.astakhnovich.task6.Human;
import com.tms.homework.astakhnovich.task6.Monkey;

public class Main {
    public static void main(String[] args) {
//        task1();
//        oneDimArray();
//        twoDimArray();
        task6();
    }

    public static void task1() {
        Task1.BinaryOperations();
    }

    public static void oneDimArray() {
        OneDimArray oneDimArray = new OneDimArray();
        oneDimArray.taskOne();
        oneDimArray.taskTwo();
        oneDimArray.taskThree();
    }

    public static void twoDimArray() {
        TwoDimArray twoDimArray = new TwoDimArray();
        twoDimArray.gettingNumber();
        twoDimArray.arrayFilling();
        twoDimArray.printTwoDimArray();
        twoDimArray.sumEvenElementsMainDiagonal();
        twoDimArray.elementsBelowMainDiagonal();
        Integer[][] arr =twoDimArray.matrixTransposition();
        twoDimArray.printTwoDimArray(arr);

    }

    public static void task6(){
        Essence essence = new Essence(200, 320);
        Essence monkey1 = new Monkey(20, 60, 4);
        Essence human = new Human(84, 188, 4, "Nikita", true);
        System.out.println(human.toString());
    }
}
