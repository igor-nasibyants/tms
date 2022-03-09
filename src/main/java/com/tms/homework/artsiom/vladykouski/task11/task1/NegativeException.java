package com.tms.homework.artsiom.vladykouski.task11.task1;

public class NegativeException extends Exception {
    int a;
    int b;
    int sq;

    NegativeException (int a, int b){
        this.a = a;
        this.b = b;
    }
    public String toString (){
        return "Ошибка. Введено отрицательное число";
    }
}
