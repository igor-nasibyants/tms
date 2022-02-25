package com.tms.homework.han.task10;

public class Task3 {
    public static void main(String[] args) {
        String str = """
                пачимутутвыводитэта\s
                Madam\s
                pop\s
                friend\s
                My\s
                first\s
                program\s
                hello\s
                world\s
                replace\s
                level\s
                """;
        String[] oneString = str.split("\n");
        StringBuilder stringBuilder = new StringBuilder();
        for (String word : oneString) {
            if (isPalindrome(word)) {
                stringBuilder.append(word);
            }
        }
        System.out.println(stringBuilder);
    }

    public static boolean isPalindrome(String text) {
        return text.replaceAll("\\W", "").
                equalsIgnoreCase(new StringBuilder(text.replaceAll("\\W", ""))
                        .reverse().toString());
    }
}
