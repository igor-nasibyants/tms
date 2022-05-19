package com.tms.task.task10.theoryMaterial;

public class StringClass {
    public static void main(String[] args) {

        //типы данных String неизменяются immutable класс не изменяемый
        //str1.toUpperCase(); не меняют (не оперируют) а возвращает новую строку (создает)
        String str1 = "JAva";
        String str2 = "Java";
        String str3 = "Hot Java";
        String[] strings = str3.split("J");
        String str4 = " Cool Java ";
        String str6 = "Java";
        str6 = str6.toUpperCase();
        System.out.println(str6);
        //методы

        System.out.println(str1.charAt(0)); // принимает индекс и возвращает символ
        System.out.println(str1.codePointAt(1)); // возвращает символ в кодировке юникод
        System.out.println(str1.compareTo(str2)); //сравнение строк без учета регистров разница символов
        System.out.println(str1.compareToIgnoreCase(str2));
        System.out.println(str1.concat(str2).concat(str4)); //аналогично System.out.println(str1+str2) cjplftn yjde. cnhjre
        System.out.println(str1.equals(str2)); // сравнивает два объекта
        System.out.println(str1.equalsIgnoreCase(str2)); //сравнение строк без учета регистров булиан
        System.out.println(str1.hashCode());//возращает hashcode объекта
        System.out.println(str1.indexOf(65)); // возвращает индекс символа, приниает переменную в кодировке юникод
        System.out.println(str1.isEmpty()); // возвращает true если строка = 0 "" если есть чтото в строке то false
        System.out.println(str1.length()); // возвращает длину строки число символов

        for (String elements : strings)
            System.out.println(elements); // принимает разделитель и возвращает масив стрингов

        System.out.println(str3.substring(2, 6)); // извлекает из строки подстроку (со 2индекса по 6)

        char[] charArray = str3.toCharArray();
        for (char element : charArray) {
            System.out.println(element); // возвращает массив символов строку разбиваем посивольно
        }

        System.out.println(str3.toLowerCase()); // приводит все ссимволы к прописным
        System.out.println(str3.toUpperCase()); // приводит все ссимволы к строчным
        System.out.println(str4.trim()); // обрезает пробелы в начале и в конце строки

        //статические методы
        System.out.println(65); //преобразует переменные заданного типа в строку
        String str5 = String.valueOf(65);


        System.out.println();


    }
}
