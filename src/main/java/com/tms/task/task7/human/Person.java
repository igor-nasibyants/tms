package com.tms.task.task7.human;

import java.util.Objects;

public class Person implements Humanable {

    private String name;
    private Integer age;
    private Sex sex;
    private Status status;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void walk() {

    }

    @Override
    public void talk() {

    }

    @Override
    public void listen() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return name.equals(person.name) && age.equals(person.age) && sex == person.sex && status == person.status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, sex, status);
    }
}
