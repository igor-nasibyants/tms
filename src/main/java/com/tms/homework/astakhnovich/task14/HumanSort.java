package com.tms.homework.astakhnovich.task14;

import com.tms.homework.astakhnovich.task6.*;
import java.util.ArrayList;
import java.util.List;

public class HumanSort {
    public static void main(String[] args) {
        humanSortList();
    }

    public static void humanSortList() {
        List<Human> humanList = new ArrayList<>();

        humanList.add(new Human(60, 170, "Roma", 18, 1));
        humanList.add(new Human(72, 180, "Maks", 22, 2));
        humanList.add(new Human(50, 160, "Sanya", 14, 3));
        humanList.add(new Human(95, 200, "Serega", 16, 4));
        humanList.add(new Human(236, 190,  "Serega", 45, 5));
        humanList.add(new Human(66, 163, "Serega", 14, 6));
        humanList.add(new Human(122, 176, "Vadim", 68, 7));
        humanList.add(new Human(67, 167, "Paladin", 54, 8));
        humanList.add(new Human(83, 188, "Nikita", 24, 9));
        humanList.add(new Human(95, 188, "Nikita", 23, 10));

        humanList.sort((h1, h2) -> {
            if (h1.getName().equals(h2.getName())) {
                return h1.getWeight().compareTo(h2.getWeight());
            } else {
                return h1.getName().compareTo(h2.getName());
            }
        });

        humanList.forEach(System.out::println);
        System.out.println();

        humanList.sort(Human::compareTo);
        humanList.forEach(System.out::println);
    }
}