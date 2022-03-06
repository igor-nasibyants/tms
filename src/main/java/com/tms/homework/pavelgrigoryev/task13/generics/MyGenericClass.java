package com.tms.homework.pavelgrigoryev.task13.generics;

public class MyGenericClass <T,S> {

    private final T x;
    private final S y;

    public MyGenericClass(T x, S y) {
        this.x = x;
        this.y = y;
    }

    public T getX() {
        return x;
    }

    public S getY() {
        return y;
    }

    @Override
    public String toString() {
        return "MyGenericClass{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
