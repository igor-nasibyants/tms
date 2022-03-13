package com.tms.homework.han.task14;

import java.util.Map;
import java.util.Scanner;

public interface Catable extends ChangeNameYear{
     static void buyCat(Map<Integer, String> cats) {
        Scanner scanner = new Scanner(System.in);
        boolean isRepeat = true;
        while (isRepeat) {
            System.out.println("Покупаете котика?");
            String willBuyCat = scanner.nextLine();
            if (willBuyCat.equalsIgnoreCase("Да")) {
                isRepeat = false;
                System.out.println("Введите минимальный возраст котика");
                int minAge = scanner.nextInt();
                System.out.println("В наличии котики(^˵◕ω◕˵^)");
                cats.forEach((age, name) -> {
                    ChangeNameYear.changeNameYear(age, name, minAge);
                });
            } else if (willBuyCat.equalsIgnoreCase("Нет")) {
                System.out.println("Просто посмотрите");
                break;
            }
        }
    }
}
