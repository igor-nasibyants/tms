package com.tms.homework.astakhnovich.task33;

import java.util.Objects;

public class Human {
    private String name;
    private String surName;
    private Integer age;

    public Human(String name, String surName, Integer age) {
        this.name = name;
        this.surName = surName;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return Objects.equals(getName(), human.getName()) && Objects.equals(getSurName(),
                human.getSurName()) && Objects.equals(getAge(), human.getAge());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSurName(), getAge());
    }
}