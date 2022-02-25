package com.tms.homework.han.task10;

public class Task3 {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder();
        str.append("пачимутутвыводитэта \n").append("Madam \n").append("pop \n").append("friend \n").append("My \n")
                .append("first \n").append("program \n").append("hello \n").append("world \n").append("level \n")
                .append("a").append("mom");
        String[] oneString = String.valueOf(str).split("\n");
        StringBuilder stringBuilder = new StringBuilder();
        for (String word : oneString) {
            if (isPalindrome(word) && word.length() > 1) {
                stringBuilder.append(word);

            }
        }
        System.out.println(stringBuilder);
    }

    public static boolean isPalindrome(String text) {
        return text.replaceAll("\\W", "")
                .equalsIgnoreCase(new StringBuilder(text.replaceAll("\\W", "")).reverse().toString());
    }
}
