package com.tms.homework.astakhnovich.task14;

import com.tms.homework.astakhnovich.task6.*;

import java.util.*;
import java.util.stream.Collectors;

public class HumanSort {
    private List<Human> humanList = new ArrayList<>();

    public static void main(String[] args) {
        HumanSort hs = new HumanSort();
        hs.humanSortList();
        hs.humanListToMap();
    }

    public void humanSortList() {
        humanList.add(new Human(60, 170, "Roma", 18, Sex.MAN, 1));
        humanList.add(new Human(72, 180, "Maks", 22, Sex.MAN, 2));
        humanList.add(new Human(50, 160, "Sanya", 14, Sex.MAN, 3));
        humanList.add(new Human(95, 200, "Serega", 16, Sex.MAN,4));
        humanList.add(new Human(236, 190,  "Serega", 45, Sex.MAN, 5));
        humanList.add(new Human(66, 163, "Serega", 14, Sex.MAN, 6));
        humanList.add(new Human(122, 176, "Vadim", 68, Sex.MAN, 7));
        humanList.add(new Human(67, 167, "Paladin", 54, Sex.MAN, 8));
        humanList.add(new Human(83, 188, "Nikita", 24, Sex.MAN, 9));
        humanList.add(new Human(95, 190, "Vlad", 17, Sex.MAN, 10));
        humanList.add(new Human(60, 167, "Lolik", 65, Sex.MAN, 11));
        humanList.add(new Human(82, 159, "Bolik", 36, Sex.MAN, 12));
        humanList.add(new Human(56, 178, "Petya", 85,  Sex.MAN,13));
        humanList.add(new Human(76, 168, "Grisha", 14, Sex.MAN, 14));
        humanList.add(new Human(49, 196, "Misha", 216, Sex.MAN, 15));

        humanList.stream()
                .sorted(Human::compareTo)
                .forEach(System.out::println);

//        humanList.sort(Human::compareTo);
//        humanList.forEach(System.out::println);
    }

    public void humanListToMap(){
        HashMap<Integer, String> hashMap = new HashMap<>(humanList.stream()
                .filter((a) -> (a.getAge() > 18 && a.getAge() < 65))
                .filter((a) -> (a.getWeight() > 60 && a.getWeight() < 90))
                .collect(Collectors.toMap(Human::getId, Human::getName)));
        //как добавить объект в значение
        //про filter

        hashMap.forEach((k, v) -> System.out.println("id: " + k + "; name: " + v));
    }
}