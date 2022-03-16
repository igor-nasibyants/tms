package com.tms.homework.han.task15;

import java.util.stream.Collectors;

import static com.tms.homework.han.task14.Main.getSetCats;

public class Main {
    public static void main(String[] args) {
        System.out.println("NEW КотикиТут бай (^˵◕ω◕˵^)");
        getSetCats().stream()
                .filter(cat -> cat.getAge() > 0)
                .collect(Collectors.toSet())
                .forEach(cat -> System.out.println("Котику " + cat.getName() + ", " + cat.getAge() + " "
                        + cat.changeEndOfAgeWord(cat.getAge())));
    }
}
