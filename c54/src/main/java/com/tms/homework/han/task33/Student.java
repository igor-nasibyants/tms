package com.tms.homework.han.task33;

import java.util.Objects;

public class Student {
    Integer age;
    String name;
    Homework hw;

    public Student(Integer age, String name, Homework hw) {
        this.age = age;
        this.name = name;
        this.hw = hw;
    }

    public Student() {
    }

    public Student(Student other) {
        this.age = other.age;
        this.name = other.name;
        this.hw = other.hw;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Homework getHw() {
        return hw;
    }

    public void setHw(Homework hw) {
        this.hw = hw;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return getAge().equals(student.getAge()) && getName().equals(student.getName()) && getHw().equals(student.getHw());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAge(), getName(), getHw());
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", hw=" + hw +
                '}';
    }
}