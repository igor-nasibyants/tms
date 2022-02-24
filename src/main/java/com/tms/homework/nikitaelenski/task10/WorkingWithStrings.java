package com.tms.homework.nikitaelenski.task10;

public class WorkingWithStrings {
    public static void  CutASubstringFromAString(String text){
        System.out.println(text.substring(text.indexOf("а"),text.lastIndexOf("г")));
    }
    public static void ReplacingOccurrencesOfCharacters(String text){
        String oneSumbol = String.valueOf(text.charAt(0));
        String twooSumbol = String.valueOf(text.charAt(3));
        System.out.println(text.replace(oneSumbol,twooSumbol));

    }
}
