package com.tms.homework.astakhnovich.task6;

public class Monkey extends Essence{
    private Integer limbs;

    public Monkey(Integer weight, Integer height, Integer limbs) {
        super(weight, height);
        this.limbs = limbs;
    }

    public Monkey(Integer limbs) {
        this.limbs = limbs;
    }
}
