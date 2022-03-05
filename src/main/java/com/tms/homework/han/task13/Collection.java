package com.tms.homework.han.task13;

import java.util.*;

public class Collection {

    public static void main(String[] args) {
        List<String> arrStr = new ArrayList<>();
        arrStr.add("first");
        arrStr.add("second");
        arrStr.add("add");
        arrStr.add("Add");
        Printable.printList(arrStr);

        List<Integer> listInt = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            listInt.add((int) (Math.random() * 5));
        }
        System.out.println("Linked arr: " + listInt);
        listInt.removeIf(value -> value < 2);
        System.out.println("Filter arr: " + listInt);
        Collections.sort(listInt);
        Printable.printList(listInt);

        Set<Integer> setInt = new HashSet<>(listInt);
        System.out.println("Set arr: " + setInt);
        setInt.add(2);
        setInt.add(8);
        setInt.add(6);
        System.out.println("New set arr: " + setInt + "\nHave size: " + setInt.size());
    }
}