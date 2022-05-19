package com.tms.homework.astakhnovich.patterns;

public class Monkey extends Essence {
    private Integer limbs;

    public Monkey(Integer weight, Integer height, Integer limbs) {
        super(weight, height);
        this.limbs = limbs;
    }

    public Monkey(Integer weight, Integer height){
        super(weight, height);
    }

    public Integer getLimbs() {
        return limbs;
    }

}
