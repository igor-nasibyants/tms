package com.tms.task4.arrays;

import java.util.Objects;

public class Pair {
    private int a;
    private String str;

    public Pair(int a, String str) {
        this.a = a;
        this.str = str;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pair pair = (Pair) o;
        return a == pair.a && Objects.equals(str, pair.str);
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, str);
    }

    @Override
    public String toString() {
        return "Pair{" +
                "a=" + a +
                ", str='" + str + '\'' +
                '}';
    }
}
