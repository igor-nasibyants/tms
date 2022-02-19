package com.tms.task.task10.theoryMaterial;

import java.util.Locale;
//если много операций со строками то используем StringBuilder не создается новый объект
public class StringBuilderClass {
    public static void main(String[] args) {
        StringBuilder str1 = new StringBuilder("Java");
        System.out.println(str1);
        str1.append(" Cool");
        str1.append(" Java");
        System.out.println(str1.toString());

        StringBuilder str2 = new StringBuilder("Max");
        System.out.println(str2);
        str2.append(" Cool").append(" Max");
        System.out.println(str2.toString());


    }
}
