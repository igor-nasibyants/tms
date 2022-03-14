package com.tms.homework.han.task14;

import java.util.Scanner;
import java.util.TreeSet;

public interface Catable extends ChangeNameYear {
    static void buyCat(TreeSet<Cat> cats) {
        Scanner scanner = new Scanner(System.in);
        boolean isRepeat = true;
        while (isRepeat) {
            System.out.println("Will you buy a cat?");
            String willBuyCat = scanner.nextLine();
            if (willBuyCat.equalsIgnoreCase("Yes")) {
                isRepeat = false;
                System.out.println("Enter minimum age of the cat");
                int minAge = scanner.nextInt();
                System.out.println("Cats for You (^˵◕ω◕˵^)");
                cats.forEach(cat -> {
                    ChangeNameYear.changeNameYear(cat.getAge(), cat.getName(), minAge);
                });
            } else if (willBuyCat.equalsIgnoreCase("No")) {
                System.out.println("Just look");
                break;
            }
        }
    }
}
