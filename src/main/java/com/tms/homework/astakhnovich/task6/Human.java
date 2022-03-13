package com.tms.homework.astakhnovich.task6;

public class Human extends Monkey implements Moveable, Talkable {
    private String name;

    public Human(Integer weight, Integer height, Integer limbs, String name) {
        super(weight, height, limbs);
        this.name = name;
    }

    @Override
    public String toString() {
        return "Human " +
                "name = " + name +
                ", weight = " + getWeight() +
                ", height =" + getHeight() +
                ", limbs =" + getLimbs();
    }

    public String getName() {
        return name;
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