package com.tms.examples;

public class Recursive {

    public static void main(String[] args) {
        divideByPositive(10, -10);
    }

    private static double divideByPositive(int a, int b)  {
        if (b <= 0) b = 1;

        double result = 0;
        try {
            result = a / b;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            divideByPositive(a, b);
        }
        return result;
    }
}
