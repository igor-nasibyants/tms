package com.tms.homework.han.task10.task4;

import static com.tms.homework.han.task10.Task3.isPalindrome;

public class TextFormatter {
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
        return "Количество слов в строке: " + str.replaceAll("[^a-zA-Z ]", "")
                .replaceAll("\\s+", " ")
                .split(" ").length;
    }
}
