package com.tms.homework.staryyo.task9;
// преобразуем символ

public class Hello {
    public static void main(String[] args) {
        String text = "Hello world!";
        try {
            System.out.println(myReplace(text));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static String myReplace(String str) throws Exception{
        if (str.length() < 4)
            throw new Exception("Не достаточно символов");
        String s1 = String.valueOf(str.toCharArray()[3]);
        String s2 = String.valueOf(str.toCharArray()[0]);
        return str.replaceAll(s1, s2);
    }
}
