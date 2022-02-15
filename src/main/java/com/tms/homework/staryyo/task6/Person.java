package com.tms.homework.staryyo.task6;

public class Person {
    private Integer height;
    private Integer age;

    public Person(Integer height, Integer age) {
        this.height = height;
        this.age = age;
    }

    public Person() { }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void say (String name){
        System.out.println("Привет, " + name);
    }
}
