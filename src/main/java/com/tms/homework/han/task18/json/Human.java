package com.tms.homework.han.task18.json;

import java.io.IOException;
import java.io.Reader;

public class Human extends Reader {
    private String name;
    private int age;
    private Human[] friends;

    public Human(String name, int age, Human[] friends) {
        this.name = name;
        this.age = age;
        this.friends = friends;
    }

    public void setFriends(Human[] friends) {
        this.friends = friends;
    }

    public Human(Human[] friends) {
        this.friends = friends;
    }

    public Human() {
        this("Non", 0, new Human[]{});
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int read(char[] cbuf, int off, int len) throws IOException {
        return 0;
    }

    @Override
    public void close() throws IOException {

    }

    public Human[] getFriends() {
        return friends;
    }
}
