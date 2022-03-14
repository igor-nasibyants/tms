package com.tms.homework.han.task14;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("All cats here BY (^˵◕ω◕˵^)");
        System.out.println(getTime());
        Catable.buyCat(getSetCats());
    }

    public static TreeSet<Cat> getSetCats() {
        Comparator<Cat> catComparator = new CatNameComparator().thenComparing(new CatAgeComparator());
        TreeSet<Cat> cats = new TreeSet<>(catComparator);
        cats.add(new Cat(13, "Julya"));
        cats.add(new Cat(15, "Nik"));
        cats.add(new Cat(1, "Nik"));
        cats.add(new Cat(10, "Julya"));
        cats.add(new Cat(4, "Barsik"));
        cats.add(new Cat(11, "Laska"));
        cats.add(new Cat(4, "Julya"));
        cats.add(new Cat(3, "Ori"));
        return cats;
    }

    public static String getTime() {
        LocalDateTime dateNow = LocalDateTime.now();
        DateTimeFormatter formatterDate = DateTimeFormatter.ofPattern("dd.MM.yyyy - HH:mm");
        return "You've come: " + dateNow.format(formatterDate);
    }
}

