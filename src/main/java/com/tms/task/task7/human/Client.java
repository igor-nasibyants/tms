package com.tms.task.task7.human;

import java.util.Objects;

public final class Client extends Human {
    public static final float PI = 3.14f;
    private Status status = Status.SINGLE;

    public Client(String name, Integer age, Sex sex) {
        super(name, age, sex);
    }

    @Override
    public void talk() {

    }

    @Override
    public void listen() {

    }

    @Override
    public void walk() {

    }

    @Override
    public void display() {
        super.display();
    }

    @Override
    public void print() {

        try {

        } catch (Exception e) {

        } finally {

        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return status == client.status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(status);
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Я удалился");
    }
}
