package com.tms.homework.han.task14;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("All cats here BY (^˵◕ω◕˵^)");
        System.out.println(getTime());
        getNeedCats(getSetCats());
    }

    public static TreeSet<Cat> getSetCats() {
        Comparator<Cat> CatNameComparator = Comparator.comparing(Cat::getName);
        Comparator<Cat> CatAgeComparator = Comparator.comparing(Cat::getAge);
        Comparator<Cat> catComparator = CatNameComparator.thenComparing(CatAgeComparator);
        TreeSet<Cat> cats = new TreeSet<>(catComparator);
        cats.add(new Cat(13, "Julya"));
        cats.add(new Cat(15, "Nik"));
        cats.add(new Cat(1, "Nik"));
        cats.add(new Cat(1, "Nike"));
        cats.add(new Cat(10, "Julya"));
        cats.add(new Cat(4, "Barsik"));
        cats.add(new Cat());
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

    public static void getNeedCats(TreeSet<Cat> cats) {
        Scanner scanner = new Scanner(System.in);
        boolean isRepeat = true;
        while (isRepeat) {
            System.out.println("Will you buy a cat? / Будете покупать котика? (Yes or No)");
            String willBuyCat = scanner.nextLine();
            if (willBuyCat.equalsIgnoreCase("Yes")) {
                isRepeat = false;
                System.out.println("Enter minimum age of the cat / Введите минимальный возраст котика");
                int minAge = scanner.nextInt();
                System.out.println("Cats for You (^˵◕ω◕˵^)");
                cats.forEach(cat -> {
                    if (cat.getAge() >= minAge) {
                        changeNameYear(cat.getAge(), cat.getName());
                    }
                });
            } else if (willBuyCat.equalsIgnoreCase("No")) {
                System.out.println("Just look");
                break;
            }
        }
    }

    public static void changeNameYear(Integer age, String name) {

        if (age % 10 == 1 && age != 11) {
            System.out.println("Котик " + name + ", " + age + " год / Cat " + name + ", " + age + " years old");
        } else if (age % 10 > 1 && age < 5) {
            System.out.println("Котик " + name + ", " + age + " года / Cat " + name + ", " + age + " years old");
        } else {
            System.out.println("Котик " + name + ", " + age + " лет / Cat " + name + ", " + age + " years old");
        }
    }
}

