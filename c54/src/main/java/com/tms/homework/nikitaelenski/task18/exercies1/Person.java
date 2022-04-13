package com.tms.homework.nikitaelenski.task18.exercies1;

import java.io.Serializable;

public class Person implements Serializable {
    private int id ;
    private String name ;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return id + ":" + name;
    }
}
