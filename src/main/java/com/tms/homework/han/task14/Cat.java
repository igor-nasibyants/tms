package com.tms.homework.han.task14;

import java.util.Optional;

public class Cat {
    private final Integer age;
    private final String name;

    public Cat(Integer age, String name) {
        this.age = age;
        this.name = name;
    }

    public Cat() {
        this(null, null);
    }

    @Override
    public String toString() {
        return "Cat " + name + " has " + age + " year";
    }

    public Integer getAge() {
        return Optional.ofNullable(age).orElse(-1);
    }

    public String getName() {
        return Optional.ofNullable(name).orElse("Non");
    }
}
