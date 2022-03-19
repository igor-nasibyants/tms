package com.tms.homework.astakhnovich.task6;

public class Human extends Monkey implements Moveable, Talkable, Comparable<Human> {
    private String name;
    private Integer age;
    private Integer id = 0;
    private Sex sex;

    public Human(Integer weight, Integer height, Integer limbs, String name) {
        super(weight, height, limbs);
        this.name = name;
    }
    public Human(Integer weight, Integer height, String name, Integer age, Sex sex, Integer id) {
        super(weight, height);
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.id = id;
    }


    @Override
    public String toString() {
        return "Human" +
                " name = " + name +
                ", age = " + age +
                " weight = " + getWeight() +
                ", height = " + getHeight();
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

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
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
            return this.getAge() - o.getAge();
        } else {
            return this.getName().compareTo(o.getName());
        }
    }
}