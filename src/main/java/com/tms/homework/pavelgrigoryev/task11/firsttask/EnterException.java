package com.tms.homework.pavelgrigoryev.task11.firsttask;

/* 1. Create a method for calculating the area of a rectangle int
squareRectangle (int a, int b), which should throw an
exception if the user enters negative value. Input values a and b
from console. Check the squareRectangle method in the
method main. Check to input nonnumeric value.*/

import java.util.Scanner;

public class EnterException {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        int b;

        System.out.println("Enter A : ");
        if (scanner.hasNextInt()) {
            a = scanner.nextInt();
            System.out.println("Enter B : ");
            if (scanner.hasNextInt()){
                b = scanner.nextInt();
                try {
                    System.out.println("Square of rectangle = " + squareRectangle(a, b));
                } catch (LessThenZeroException e) {
                    e.printStackTrace();
                }
            } else {
                System.err.println("Non numeric value of B or not an Integer!");
            }
        } else {
            System.err.println("Non numeric value of A  or not an Integer!");
        }
    }

    public static int squareRectangle (int a, int b) throws LessThenZeroException {
        if (a < 0 || b < 0) {
            throw new LessThenZeroException ("Value less than zero");
        }
        return a * b;
    }

}
