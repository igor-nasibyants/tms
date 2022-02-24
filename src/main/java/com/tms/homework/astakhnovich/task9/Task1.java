package com.tms.homework.astakhnovich.task9;

public class Task1 {
    private static StringBuilder text = new StringBuilder("На горячем песке возле реки играют мальчики. Где они" +
            " возводят замок. Около них крутится веселый щенок.");


    public static void main(String[] args) {
        int firstIndex = text.indexOf("п");
        int lastIndex = text.lastIndexOf("в");
        text.replace(firstIndex, lastIndex, "");

        System.out.println(text);
    }
}
