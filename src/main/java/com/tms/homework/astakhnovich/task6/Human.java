package com.tms.homework.astakhnovich.task6;

public class Human extends Monkey{
    private String name;
    private boolean conscience;


    public Human(Integer weight, Integer height, Integer limbs, String name, boolean conscience) {
        super(weight, height, limbs);
        this.name = name;
        this.conscience = conscience;
    }

    public String getName() {
        return name;
    }

    public boolean isConscience() {
        return conscience;
    }

    @Override
    public String toString() {
        return "Human " +
                "name = " + name +
                ", weight = " + getWeight() +
                ", height =" + getHeight()  +
                ", limbs =" + getLimbs() +
                ", conscience = " + isConscience();
    }
}
