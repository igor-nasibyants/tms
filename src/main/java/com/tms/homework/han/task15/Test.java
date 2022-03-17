package com.tms.homework.han.task15;

import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

import static com.tms.homework.han.task14.Main.getSetCats;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(331);
        list.add(33);
        list.add(1);
        list.stream().filter(word -> word > 4)
                .collect(Collectors.toSet())
                .parallelStream()
                .forEach(word -> System.out.print(word + " "));
        System.out.println();
        getSetCats().stream()
                .toList()
                .forEach(System.out::println);
    }
}
