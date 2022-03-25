package com.tms.homework.han.task18.hero;

abstract class Human implements Sayable {

    private final Integer id;
    private final String name;
    private final Integer age;

    public Human(String name, Integer age, Integer id) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public void say() {
        System.out.println("Hello");
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
