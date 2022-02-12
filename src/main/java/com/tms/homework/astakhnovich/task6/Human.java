package com.tms.homework.astakhnovich.task6;

public class Human extends Monkey implements Moveable, Talkable{
    private String name;
    private boolean conscience;


    public Human(Integer weight, Integer height, Integer limbs, String name, boolean conscience) {
        super(weight, height, limbs);
        this.name = name;
        this.conscience = conscience;
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

    @Override
    public void run() {

    }

    @Override
    public void jump() {

    }

    @Override
    public void swim() {

    }

    @Override
    public void shout() {

    }

    @Override
    public void talk() {

    }

    @Override
    public void whisper() {

    }
}
