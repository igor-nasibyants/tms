package com.tms.homework.han.task14;

public interface ChangeNameYear {

    static void changeNameYear(Integer age, String name) {

        if (age % 10 == 1 && age != 11) {
            System.out.println("Котик " + name + ", " + age + " год / Cat " + name + ", " + age + " years old");
        } else if (age % 10 > 1 && age < 5) {
            System.out.println("Котик " + name + ", " + age + " года / Cat " + name + ", " + age + " years old");
        } else {
            System.out.println("Котик " + name + ", " + age + " лет / Cat " + name + ", " + age + " years old");
        }
    }
}
