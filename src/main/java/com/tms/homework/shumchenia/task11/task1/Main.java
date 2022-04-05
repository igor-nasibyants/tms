package com.tms.homework.shumchenia.task11.task1;

public class Main {
    public static void main(String[] args) {

        try {
            System.out.println(squareRectangle(-9,7));
        } catch (NegativeNumberException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }


    }

    public static int squareRectangle(int a, int b) throws NegativeNumberException{
        if(a<0||b<0) throw new NegativeNumberException("number less then zero");
        return a*b;
    }
}
