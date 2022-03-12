package com.tms.homework.han.task14;

public class Cat<T, E> {
    private final T age;
    private final E name;

    public Cat(T age, E name) {
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

    public T getAge() {
        return age;
    }

    public E getName() {
        return name;
    }
}
