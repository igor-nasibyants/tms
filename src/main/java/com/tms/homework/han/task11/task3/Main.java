package com.tms.homework.han.task11.task3;

import com.tms.homework.han.task11.task1.GetNumber;


public class Main implements GetNumber {
    public static void main(String[] args) {
        double a = GetNumber.getNumber("1");
        double b = GetNumber.getNumber("2");
        System.out.println(div(a, b));
    }


    public static double div(double a, double b) {
        return a / b;
    }
}
