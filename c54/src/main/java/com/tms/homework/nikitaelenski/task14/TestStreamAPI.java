package com.tms.homework.nikitaelenski.task14;

import java.util.*;

public class TestStreamAPI {

    public static void main(String[] args) {
        List<Integer> collection = new ArrayList<>();
        collection.add(1);
        collection.add(2);
        collection.add(3);
        collection.add(4);
        collection.add(5);
        collection.add(6);
        collection.add(7);
        collection.add(8);

        Map<String , String> states = new HashMap<String , String>();
        states.put("1","Никита");
        states.put("2","Антон");
        states.put("3","Варя");
        states.put("4","Геннадий");
        Collection<String> values = states.values();
        System.out.println(states);
        System.out.println(states.get("1"));


        Integer xxx = collection.stream().filter(o -> o % 2 != 1)
               .reduce((s1, s2) -> s1 + s2)
                .orElse(0);
//        System.out.println(xxx);

        collection.stream().filter(o-> o % 2 != 1).forEach(System.out::println);

    }
}
