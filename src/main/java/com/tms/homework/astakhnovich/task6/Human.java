package com.tms.homework.astakhnovich.task6;

public class Human extends Monkey implements Moveable, Talkable, Comparable<Human> {
    private String name;
    private Integer age;
    private Integer id = 0;

    public Human(Integer weight, Integer height, Integer limbs, String name) {
        super(weight, height, limbs);
        this.name = name;
    }
    public Human(Integer weight, Integer height,  String name, Integer age,  Integer id) {
        super(weight, height);
        this.name = name;
        this.age = age;
        this.id = id;
    }


    @Override
    public String toString() {
        return "Human" +
                " name='" + name + '\'' +
                ", age=" + age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public int getId() {
        return id;
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

    @Override
    public int compareTo(Human o) {
        if (this.getName().equals(o.getName())) {
            return this.getHeight() - o.getHeight();
        } else {
            return this.getName().compareTo(o.getName());
        }
    }
}