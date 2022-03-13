package com.tms.homework.astakhnovich.task14;

import com.tms.homework.astakhnovich.task6.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class HumanSort {
    public static void main(String[] args) {
        humanSortList();
    }

    public static void humanSortList() {
        Human Roma = new Human(60, 170, 4, "Roma");
        Human Maks = new Human(72, 180, 4, "Maks");
        Human Sanya = new Human(50, 160, 4, "Sanya");
        Human Serega = new Human(95, 200, 4, "Serega");
        Human Serega1 = new Human(236, 190, 4, "Serega");
        Human Serega2 = new Human(66, 163, 4, "Serega");
        Human Vadim = new Human(120, 176, 4, "Vadim");

        List<Human> humanList = new ArrayList<>();

        humanList.add(Roma);
        humanList.add(Maks);
        humanList.add(Sanya);
        humanList.add(Serega);
        humanList.add(Serega1);
        humanList.add(Serega2);
        humanList.add(Vadim);
        humanList.sort(new Comparator<Human>() {
            @Override
            public int compare(Human h1, Human h2) {
                if (h1.getName().equals(h2.getName())) {
                    return h1.getWeight().compareTo(h2.getWeight());
                } else {
                    return h1.getName().compareTo(h2.getName());
                }
            }
        });

        humanList.forEach(System.out::println);
        System.out.println();

        Collections.sort(humanList, (h1, h2) -> {
            if (h1.getName().equals(h2.getName())) {
                return h1.getHeight() - h2.getHeight();
            } else {
                return h1.getName().compareTo(h2.getName());
            }
        });
        humanList.forEach(System.out::println);
    }
}