package com.tms.task.task6;

public class Person {
    private int age;
    private String name;

    private Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Person(int age) {
        this(age, "Peter");
    }

    public Person(String name) {
        this(18, name);
    }

    public Person() {
        this(18, "Tom");
    }

    public static void printDefault() {
        System.out.println("new Person()");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return name + ", " + age;
    }

    public void printChangedPerson() {
        this.setAge(33);
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
