package com.tms.homework.han.task13;

import java.util.*;

public class HashTable {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>();
        Map<Integer, String> randomHashmap = new HashMap<>();
        while (hashMap.size() < 5) {
            hashMap.put(hashMap.size() + 1, (hashMap.size() + " element"));
        }
        while (randomHashmap.size() < 5) {
            randomHashmap.put((int) (Math.random() * 5) + 1, (randomHashmap.size() + " element"));
        }
        System.out.println("No random");
        for (Map.Entry<Integer, String> elem : hashMap.entrySet()) {
            System.out.println(elem.getKey() + " = " + elem.getValue());
        }
        System.out.println("Random");
        for (Map.Entry<Integer, String> elem : randomHashmap.entrySet()) {
            System.out.println(elem.getKey() + " = " + elem.getValue());
        }
    }
}
