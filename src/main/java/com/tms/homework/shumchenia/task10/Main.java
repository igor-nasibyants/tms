package com.tms.homework.shumchenia.task10;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        String str=new String("My names's Matvei");
        StringBuilder stringBuilder=new StringBuilder("My names's Matvei");
        task1(stringBuilder);
        task2(str);

    }

    public static void task1(StringBuilder stringBuilder) {
        stringBuilder=stringBuilder.replace(stringBuilder.indexOf("n"),stringBuilder.lastIndexOf("e"),"");
        System.out.println(stringBuilder);
    }
    public static void task2(String str) {
        str = str.replace("s","q");
        System.out.println(str);
    }
}
