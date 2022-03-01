package com.tms.homework.pavelgrigoryev.task11.thirdtask;

/*• Create method div(), which calculates the dividing of two double
        numbers. In main method input 2 double numbers and call this
        method. Catch all exceptions.*/

import java.util.Scanner;

public class AdditionalException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a;
        double b;

        System.out.println("Enter first double : ");
        if (scanner.hasNextDouble()) {
            a = scanner.nextDouble();
            System.out.println("Enter second double : ");
            if (scanner.hasNextDouble()) {
                b = scanner.nextDouble();
                System.out.println(a + " / " + b + " = " + div(a,b));
            } else {
                try {
                    throw new ThisIsNotADoubleException("Unknown symbol(s) in second double!");
                } catch (ThisIsNotADoubleException e) {
                    e.printStackTrace();
                }
            }
        }  else {
            try {
                throw new ThisIsNotADoubleException("Unknown symbol(s) in first double!");
            } catch (ThisIsNotADoubleException e) {
                e.printStackTrace();
            }
        }
    }
    public static double div(double a, double b) {
        return a / b;
    }
}
