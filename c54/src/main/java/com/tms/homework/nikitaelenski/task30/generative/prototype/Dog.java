package com.tms.homework.nikitaelenski.task30.generative.prototype;

public class Dog implements Copyable{
    private int size ;
    private String name;
    private String sound;

    public Dog(int size, String name, String sound) {
        this.size = size;
        this.name = name;
        this.sound = sound;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    @Override
    public Object copy() {
        Dog dog = new Dog(size,name,sound);
        return dog;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "size=" + size +
                ", name='" + name + '\'' +
                ", sound='" + sound + '\'' +
                '}';
    }
}
