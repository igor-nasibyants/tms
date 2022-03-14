package com.tms.homework.han.task14;

public interface ChangeNameYear {

    static void changeNameYear(Integer age, String name, Integer minAge) {
        if (age >= minAge) {
            if (age % 10 == 1 && age != 11) {
                System.out.println("Cat " + name + ", " + age + " years old");
            } else if (age % 10 > 1 && age < 5) {
                System.out.println("Cat " + name + ", " + age + " years old");
            } else {
                System.out.println("Cat " + name + ", " + age + " years old");
            }
        }
    }
}
