package com.tms.homework.artsiom.vladykouski.task11.task1;
import java.util.Scanner;

public class Rectangle implements Squareable {
    private int a;
    private int b;
    Scanner sc = new Scanner(System.in);

    Rectangle (){
       this.a = sc.nextInt();
       this.b = sc.nextInt();
   }
    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }
    @Override
    public int squareRectangle() {
        return a*b;
    }
}
