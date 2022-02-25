package com.tms.homework.han.task10.task4;

import com.tms.homework.han.task10.Task3;

public class TextFormatter extends Task3 implements Formatable {
    public static String getNumberLines(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        String[] arrStr = str.split("\\. ");
        boolean isRepeat;
        for (String text : arrStr) {
            isRepeat = true;
            String[] tempArr = text.split(" ");
            for (String word : tempArr) {
                if (isPalindrome(word) && word.length() > 1) {
                    stringBuilder.append(text);
                    stringBuilder.append("\n");
                    isRepeat = false;
                    break;
                }
            }
            if (tempArr.length >= 3 && tempArr.length <= 5 && isRepeat) {
                stringBuilder.append(text);
                stringBuilder.append("\n");
            }
        }
        System.out.println(stringBuilder);
        return "Количество слов в строке: " + Formatable.formatting(str).split(" ").length;
    }
}
