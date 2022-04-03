package com.tms.homework.nikitaelenski.task17;


import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        List<String> text = new ArrayList<>();
        text.add("Егор Бычков Олегович");
        text.add("Егор Бычков Степанович");
        text.add("Соловьев Анон Антонович");
        text.add("Григорьев Никита Никитич");
        text.add("Яркий Антон Львович");

        String str = "*";

        List<String> name = new ArrayList<>();
        Map< Integer ,  String > nameHash = new HashMap<>();

        System.out.println(str.repeat(60));
            for (int x = 0 ; x < text.size() ; x++) {
                Pattern pattern = Pattern.compile("Бычков(\\w*)");
                Matcher matcher = pattern.matcher(text.get(x));
                System.out.println(matcher.replaceAll("Соловьев"));
                name.add(matcher.replaceAll("Соловьев"));
                nameHash.put(x+1 , matcher.replaceAll("Соловьев"));
                }

        System.out.println(str.repeat(60));

        name.stream()
                .forEach(System.out::println);

        System.out.println(str.repeat(60));

        nameHash.forEach((key, value) -> System.out.println(key + " - " +value));
        }
}
