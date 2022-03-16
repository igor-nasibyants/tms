package com.tms.homework.han.task14;

public class Cat {
    private final Integer age;
    private final String name;

    public Cat(Integer age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat " + name + " has " + age + " year";
    }

    public Integer getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
