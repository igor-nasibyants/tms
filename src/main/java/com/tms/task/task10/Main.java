package com.tms.task.task10;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String s1 = "Текстовый файл содержит текст. После запуска программы в другой файл\n" +
                "должны записаться только те предложения в которых от 3-х до 5-ти слов. Если в\n" +
                "предложении присутствует слово-палиндром, то не имеет значения какое кол-во\n" +
                "слов в предложении, оно попадает в новый файл.\n" +
                "Пишем все в ООП стиле. Создаём класс TextFormater\n" +
                "в котором два статических метода:\n" +
                "1. Метод принимает строку и возвращает кол-во слов в строке.\n" +
                "2. Метод принимает строку и проверяет есть ли в строке слово-палиндром. Если\n" +
                "есть возвращает true, если нет false";
        String s2 = new String("string 123");

        s1 = s1 + " 123";

        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("string");
        stringBuffer.append(" ");
        stringBuffer.append("123");
        String s3 = stringBuffer.toString();

        String s4 = new String(new StringBuffer().append("string").append(" ").append("123"));

        String s5 = new StringBuilder().append("string").append(" ").append("123").toString();
        String s6 = new String(new StringBuilder().append("string").append(" ").append("123"));

        List<String> arr = new ArrayList<>();
        arr.add(s1);
        arr.add(s2);
        arr.add(s3);
        arr.add(s4);
        arr.add(s5);
        arr.add(s6);
//        System.out.println(String.join(":", arr));

        String str0 = "A125";
        String str01 = "a125";
        String str02 = "a125 ";
        String str1 = "12345";
        String str2 = "123445";

        if (str0.equalsIgnoreCase(str01)) {
            System.out.println("ignore true");
        }

        char[] chars = new char[3];
        str0.getChars(0, 1, chars, 0);

        if (str0.compareTo(str01) == 1) {
            System.out.println(str0);
        }

        if (str1.compareTo(str2) == 1) {
            System.out.println(str1);
        }


        String name1 = new String("name");
        String name = "name";

        if ("   Name     ".trim().toUpperCase().equalsIgnoreCase(name1)) {
            System.out.println(name);
        }
    }
}
