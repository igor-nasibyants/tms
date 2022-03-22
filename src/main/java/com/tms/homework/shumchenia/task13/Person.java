package com.tms.homework.shumchenia.task13;

import java.util.Objects;

public class Person implements Comparable<Person> {
    private Integer id;
    private Integer age;
    private String name;

    public Person(Integer id, String name, Integer age) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(id, person.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public int compareTo(Person p) {
        return name.compareTo(p.getName());
    }

}
