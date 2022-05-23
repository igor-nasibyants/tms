package com.tms.homework.nikitaelenski.task30.generative.prototype;

public class MyDog {
    Dog dog;

    public MyDog(Dog dog) {
        this.dog = dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }
    Dog cloneDog(){
        return (Dog) dog.copy();
    }
}
