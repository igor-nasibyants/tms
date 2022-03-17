package com.tms.homework.astakhnovich.task14;

import com.tms.homework.astakhnovich.task6.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HumanSort {
    public static void main(String[] args) {
        humanSortList();
    }

    public static void humanSortList() {
        Human roma = new Human(60, 170, 4, "Roma");
        Human maks = new Human(72, 180, 4, "Maks");
        Human sanya = new Human(50, 160, 4, "Sanya");
        Human serega = new Human(95, 200, 4, "Serega");
        Human serega1 = new Human(236, 190, 4, "Serega");
        Human serega2 = new Human(66, 163, 4, "Serega");
        Human vadim = new Human(120, 176, 4, "Vadim");

        List<Human> humanList = new ArrayList<>();

        humanList.add(roma);
        humanList.add(maks);
        humanList.add(sanya);
        humanList.add(serega);
        humanList.add(serega1);
        humanList.add(serega2);
        humanList.add(vadim);
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