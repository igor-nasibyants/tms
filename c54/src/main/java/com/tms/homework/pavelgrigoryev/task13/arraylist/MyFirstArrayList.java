package com.tms.homework.pavelgrigoryev.task13.arraylist;

import java.util.ArrayList;

public class MyFirstArrayList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add(0,"Петя");
        names.add(1,"Вася");
        names.add(2,"Толик");
        names.add(3,"Серёга");

        printNames(names);

        if (names.contains("Серёга")) {
            names.add("Артём");
        }

        printNames(names);

        names.remove(3);

        printNames(names);

        if (names.indexOf("Артём") != 4) {
            names.add(4,"Никита");
        }

        printNames(names);

        if (names.contains("Толик")) {
            names.add("Андрей");
        }

        printNames(names);
    }
    public static void printNames(ArrayList<String> arrayList) {
        for (String element : arrayList) {
            System.out.print(element + " ");
        }
        System.out.println("!!!");
    }
}
