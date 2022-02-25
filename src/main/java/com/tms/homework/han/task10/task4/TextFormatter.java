package com.tms.homework.han.task10.task4;

import com.tms.homework.han.task10.Task3;

import java.util.StringTokenizer;

public class TextFormatter extends Task3 {
    public static String getNumberLines(String str) {
        int count = 0;
        StringBuilder stringBuilder = new StringBuilder();
        String[] arrStr = str.split("\\. ");
        boolean isRepeat;
        for (String text : arrStr) {
            isRepeat = true;
            String phrase = text.replaceAll("\\W", " ").replaceAll("\\W", " ");
            String[] tempArr = phrase.split(" ");
            for (String word : tempArr) {
                count++;
                if (isPalindrome(word) && word.length() > 1) {
                    stringBuilder.append(phrase);
                    stringBuilder.append("\n");
                    isRepeat = false;
                    break;
                }
            }
            if (tempArr.length >= 3 && tempArr.length <= 5 && isRepeat) {
                stringBuilder.append(phrase);
                stringBuilder.append("\n");
            }
        }
        System.out.println(stringBuilder);
        return "Количество слов в строке: " + count;
    }
}
