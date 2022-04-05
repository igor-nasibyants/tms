package com.tms.homework.han.task18.hero;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Main {
    private static final SuperHero toniStark = new IronMan("Tony Stark", 48, 1, "Money", 1000);
    private static final SuperHero petterParker = new SpiderMan("Petter Parker", 25, 2, "Web", 600);
    private static final SuperHero milesMorales = new SpiderMan("Miles Morales", 20, 3, "Electricity", 700);
    private static final SuperHero cap = new Cap("Steve Rogers", 48, 4, "Super strength", 300);

    private static final Comparator<SuperHero> compAge = Comparator.comparing(SuperHero::getAge);
    private static final Comparator<SuperHero> compSpeed = Comparator.comparing(SuperHero::getSpeed);
    private static final Comparator<SuperHero> compHero = compAge.thenComparing(compSpeed);

    private static final Set<SuperHero> hero = new TreeSet<>(compHero) {{
        add(toniStark);
        add(petterParker);
        add(milesMorales);
        add(cap);
    }};

    public static void main(String[] args) {
        getHeroMap();
    }

    public static void getHeroMap() {
        hero.stream()
            .filter(superHero -> superHero.getSpeed() > 600)
            .collect(Collectors.toMap(SuperHero::getId, v -> v))
            .forEach((k, v) -> System.out.println("ID: " + k + ", Name: " + v.getName() + ", age: " + v.getAge()
                    + ", super power: " + v.getSuperPower() + ", speed: " + v.getSpeed()));
    }
}
