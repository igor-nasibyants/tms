package com.tms.homework.han.task15;

import com.tms.homework.han.task14.Cat;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import static com.tms.homework.han.task14.Main.getSetCats;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> catsMap = new HashMap<>(30, 1);
        catsMap.putAll(getSetCats().stream()
                .filter(cat -> cat.getAge() >= 0 && cat.getAge() < 20)
                .collect(Collectors.toMap(Cat::getAge, Cat::getName, (oldValue, newValue) -> newValue)));
        catsMap.forEach((k, v) -> System.out.println("Котику " + v + ", " + k + " " + changeEndOfAgeWord(k)));
        System.out.println("==========================================================");

        for (Map.Entry<Integer, String> cat : catsMap.entrySet()) {
            System.out.println("Котику " + cat.getValue() + ", " + cat.getKey() + " " + changeEndOfAgeWord(cat.getKey()));
        }
        System.out.println("==========================================================");

        getSetCats().stream()
                .filter(cat -> cat.getAge() >= 0 && cat.getAge() < 20)
                .collect(Collectors.toSet())
                .forEach(cat -> System.out.println("Котику " + cat.getName() + ", " + cat.getAge() + " "
                        + changeEndOfAgeWord(cat.getAge())));
    }

    public static String changeEndOfAgeWord(Integer age) {
        if (age % 10 == 1 && age != 11) {
            return "год";
        } else if (age % 10 > 1 && age < 5) {
            return "года";
        } else {
            return "лет";
        }
    }
}
