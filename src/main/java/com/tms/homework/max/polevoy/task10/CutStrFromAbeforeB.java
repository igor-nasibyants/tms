package com.tms.homework.max.polevoy.task10;

public class CutStrFromAbeforeB {
    public static void main(String[] args) {
        StringBuilder text = new StringBuilder("Вырезать подстроку из строки начиная с первого вхождения символа");
        int indexA = text.indexOf("а"); // Метод indexOf ищет в нашей строке указанную строку "а"
        int indexB = text.lastIndexOf("в"); // Метод lastIndexOf ищет указанную строку "в" нашей строке с конца

        String first = text.substring(0, indexA); // Получаем строку от начала (0) и заканчивая символами 'a'
        String last = text.substring(indexB); // Получаем строку от "в" и до конца

        String result = first + "" + last; // Склеиваем полученые строки
        String result2 = String.join("", first, last); // Метод объединения с учетом разделителя - join()
        String result3 = first.concat(last); //Метод объединения строк - concat()

        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
    }
}
