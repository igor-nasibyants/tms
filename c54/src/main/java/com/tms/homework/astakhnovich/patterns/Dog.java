package com.tms.homework.astakhnovich.patterns;

public class Dog extends Essence{
    private Integer paw;

    public Dog(Integer weight, Integer height, Integer paw) {
        super(weight, height);
        this.paw = paw;
    }

    public Integer getPaw() {
        return paw;
    }

    public void setPaw(Integer paw) {
        this.paw = paw;
    }
}
