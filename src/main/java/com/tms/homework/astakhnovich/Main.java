package com.tms.homework.astakhnovich;


import com.tms.homework.astakhnovich.task1.Task1;
import com.tms.homework.astakhnovich.task12.TextReadAndWrite;
import com.tms.homework.astakhnovich.task3.OneDimArray;
import com.tms.homework.astakhnovich.task3.TwoDimArray;
import com.tms.homework.astakhnovich.task6.Essence;
import com.tms.homework.astakhnovich.task6.Human;
import com.tms.homework.astakhnovich.task6.Monkey;
import com.tms.homework.astakhnovich.task9.TextFormater;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
//        task1();
//        oneDimArray();
//        twoDimArray();
//        task6();
//        task9();
        task11();
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
        Integer[][] arr = twoDimArray.matrixTransposition();
        twoDimArray.printTwoDimArray(arr);

    }

    public static void task6() {
        Essence monkey1 = new Monkey(20, 60, 4);
        Essence human = new Human(84, 188, 4, "Nikita", true);
        System.out.println(human.toString());
    }

    public static void task9(){
        TextFormater textFormater = new TextFormater();
        System.out.println(textFormater.numberOfWords("hi i'm nikita"));
        System.out.println(textFormater.presenceOfPalindrome("hi i'm nikin"));
    }

    public static void task11(){
        TextReadAndWrite traw = new TextReadAndWrite("hi. My name is nikita and I'm 24" +
                "\nI study in TMS ");
        try {
            traw.textWriter("C://MyFile.txt");
        }catch (IOException e){
            System.out.println("ups part 1");
        }

        try {
            traw.textReader("C://MyFile.txt");
        }catch (IOException e){
            System.out.println("ups part 2");
        }
    }
}
