package com.tms.homework.astakhnovich.task1to19.task9;

public class Task2 {

    public static void main(String[] args) {
        String text1 = "Meet my family. There are five of us – my parents, my elder brother, my baby sister and me.";
        String newSymbol = String.valueOf(text1.charAt(0));
        String oldSymbol = String.valueOf(text1.charAt(3));

        text1 = text1.replace(oldSymbol, newSymbol);

        System.out.println(text1);
    }
}
