package com.tms.homework.han.task18.hero;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        getHeroMap();
    }

    public static void getHeroMap() {
        SuperHero toniStark = new IronMan("Tony Stark", 48, 1, "Money", 1000);
        SuperHero petterParker = new SpiderMan("Petter Parker", 25, 2, "Web", 600);
        SuperHero milesMorales = new SpiderMan("Miles Morales", 20, 3, "Electricity", 700);
        SuperHero cap = new Cap("Steve Rogers", 48, 4, "Super strength", 300);

        Comparator<SuperHero> compAge = Comparator.comparing(SuperHero::getAge);
        Comparator<SuperHero> compSpeed = Comparator.comparing(SuperHero::getSpeed);
        Comparator<SuperHero> compHero = compAge.thenComparing(compSpeed);

        Set<SuperHero> hero = new TreeSet<>(compHero);
        hero.add(toniStark);
        hero.add(petterParker);
        hero.add(milesMorales);
        hero.add(cap);

        Map<Integer, SuperHero> fastHero = hero.stream().
                filter(superHero -> superHero.getSpeed() > 600)
                .collect(Collectors.toMap(SuperHero::getId, v -> v));
        fastHero.forEach((k, v) -> System.out.println("ID: " + k + ", Name: " + v.getName() + ", age: " + v.getAge()
                + ", super power: " + v.getSuperPower() + ", speed: " + v.getSpeed()));
    }
}
