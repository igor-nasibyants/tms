package com.tms.homework.han.task10.task4;

import com.tms.homework.han.task10.Task3;

public class TextFormatter extends Task3 {
    public static StringBuilder filterString(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        String[] arrStr = str.split("\\. ");
        boolean isRepeat = true;
        for (String text : arrStr) {
            String phrase = text.replaceAll("\\W", " ").replaceAll("\\W", " ");
            String[] tempArr = phrase.split(" ");
            for (String word : tempArr) {
                if (isPalindrome(word) && word.length() > 2) {
                    stringBuilder.append(phrase);
                    isRepeat = false;
                    break;
                }
            }
            if (tempArr.length >= 3 && tempArr.length <= 5 && isRepeat) {
                stringBuilder.append(phrase);
                stringBuilder.append("\n");
            }
        }
        return stringBuilder;
    }
}
