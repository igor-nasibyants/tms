package com.tms.homework.han.task11.task3;

import com.tms.homework.han.task11.task1.GetNumber;
import com.tms.homework.han.task11.task1.MyException;


public class Main implements GetNumber {
    public static void main(String[] args) {
        double a = 0;
        try {
            a = GetNumber.getNumber("1");
        } catch (MyException e) {
            e.printStackTrace();
        }
        double b = 0;
        try {
            b = GetNumber.getNumber("2");
        } catch (MyException e) {
            e.printStackTrace();
        }

        System.out.println(div(a, b));
    }


    public static double div(double a, double b) {
        return a / b;
    }
}
