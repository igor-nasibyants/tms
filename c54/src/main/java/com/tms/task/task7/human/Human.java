package com.tms.task.task7.human;

import com.tms.task.task7.Printable;

public abstract class Human implements Printable {

    private String name;
    private Integer age;
    private Sex sex;

    public Human(String name, Integer age, Sex sex) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public abstract void talk();

    public abstract void listen();

    public abstract void walk();

    protected void display() {
        System.out.println("name = " + name);
    }

}
