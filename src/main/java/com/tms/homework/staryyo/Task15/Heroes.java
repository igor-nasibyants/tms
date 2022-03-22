package com.tms.homework.staryyo.Task15;

import java.util.Objects;


public class Heroes {
    private final String name;
    private final Integer power;
    private final String complexity;

    public Heroes(String name, Integer power, String complexity) {
        this.name = name;
        this.power = power;
        this.complexity = complexity;
    }

    public String getComplexity() {
        return name;
    }

    public String getName() {
        return complexity;
    }

    public Integer getPower() {
        return power;
    }

    @Override
    public String toString() {
        return name + "-" + power + "-" + complexity;
    }


    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, power, complexity);
    }
}



