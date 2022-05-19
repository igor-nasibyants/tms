package com.tms.homework.astakhnovich.patterns;

public abstract class Essence {
    private Integer weight;
    private Integer height;

    public Essence(Integer weight, Integer height) {
        this.weight = weight;
        this.height = height;
    }

    public Integer getWeight() {
        return weight;
    }

    public Integer getHeight() {
        return height;
    }
}
