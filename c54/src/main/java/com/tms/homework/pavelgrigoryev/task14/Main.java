package com.tms.homework.pavelgrigoryev.task14;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Orc> orcs = new ArrayList<>();
        orcs.add(new Orc("Conqueror","Azog"));
        orcs.add(new Orc("Andarion","Balkmeg"));
        orcs.add(new Orc("Higher","Golfumbul"));
        orcs.add(new Orc("Zindik","Azgharik"));
        orcs.add(new Orc("Domambul","Dodik"));


        orcs.sort(((o1, o2) -> {
            if (o1.getLastname().compareTo(o2.getLastname()) != 0) {
                return o1.getLastname().compareTo(o2.getLastname());
            } else {
                return o1.getFirstname().compareTo(o2.getFirstname());
            }
        }));
        System.out.println(orcs);
    }
}
