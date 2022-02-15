package com.tms.homework.maria.varabyova.task7;

public class Journal implements Printable {

    private String name;

    Journal(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    public void print() {
        System.out.println(name);
    }
}
