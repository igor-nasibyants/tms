package com.tms.homework.han.task14;

import java.util.Scanner;
import java.util.TreeSet;

public interface Catable {
    static void buyCat(TreeSet<Cat> cats) {
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
                        ChangeNameYear.changeNameYear(cat.getAge(), cat.getName());
                    }
                });
            } else if (willBuyCat.equalsIgnoreCase("No")) {
                System.out.println("Just look");
                break;
            }
        }
    }
}
