package com.tms.homework.artsiom.vladykouski.task11.task1;

public class Main extends Rectangle {

    public static void main(String[] args){
        Rectangle c = new Rectangle();

        try{
            if (c.getA() < 0 | c.getB() <0)
            throw new NegativeException(c.getA(), c.getB());
            System.out.println("Площадь прямоугольника равна: " + c.squareRectangle());
        }
        catch (NegativeException e){
            System.out.println(e);
        }
    }
}

