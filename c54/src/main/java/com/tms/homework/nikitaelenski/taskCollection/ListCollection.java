package com.tms.homework.nikitaelenski.taskCollection;


import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ListCollection {
    public static void main(String[] args) {
        String text =
                ", люди самые разнородные по возрастам характерам, но одинаковые по обществу,в каком все жили" +
                "; приехала дочь князя Василия, красавица Элен, заехавшая за отцом, чтобы с ним вместе ехать " +
                "на праздникпосланника. Она была в шифре и бальном платье. Приехала и известная," +
                " как , молодая, маленькая княгиня Болконская," +
                " прошлую зиму вышедшая замуж и теперь не выезжавшая в большой свет по причине своей беременности," +
                " но ездившая еще на небольшие вечера. Приехал князь ипполит, сын князя Василия, с Мортемаром," +
                " которого он представил; приехал и аббат Морио  многие другие.";

        List<Integer> my = Arrays.asList(3, 4, 4, 5, 6, 6, 7, 8, 9, 9, 9);

        List<String> str = Arrays.asList("Существуют", "две", "основные", "трактовки", "понятия", "«текст»:", "имманентная",
                "расширенная", "философски", "нагруженная", "и", "репрезентативная", "более", "частная",
                "имманентный", "подход", "подразумевает", "отношение", "к", "тексту", "как", "к", "автономной", "реальности",
                "нацеленность", "на", "выявление", "его", "внутренней", "структуры", "Репрезентативный", "рассмотрение", "текста",
                "как", "особой", "формы", "представления", "информации", "о", "внешней", "тексту", "действительности");

        System.out.println("Четные");
        my.stream()
                .filter(i -> i % 2 == 0)
                .forEach(x -> System.out.print(x + " "));

        System.out.println("\nНе Четные");
        my.stream()
                .filter(i -> i % 2 == 1)
                .forEach(x -> System.out.print(x + " "));

        System.out.println("\nКоличество одинаковых повтряющихся один раз ");

        my.stream()
                .filter(i -> Collections.frequency(my, i) == 1)
                .collect(Collectors.toSet())
                .forEach(x -> System.out.print(x + " "));

        System.out.println("\nЧасто повторяющиеся слово");

        String s = str.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(null);
        System.out.println(s);

        System.out.println("Не часто повторяющиеся слово");

        String x = str.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .min(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse("нету");
        System.out.println(x);


        System.out.println("Делаем из текста ЛиСТ и находим слово повторябщиеся большее количествро раз");
        text  = text.replaceAll("[-+.^:,;]"," ");
        text  = text.replaceAll("  "," ");
        List<String> st = new ArrayList<>(Arrays.asList(text.split(" ")));
        String l = st.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse("нету");

        System.out.println(l);
    }
}
