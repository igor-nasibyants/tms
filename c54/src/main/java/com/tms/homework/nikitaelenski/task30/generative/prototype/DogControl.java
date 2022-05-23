package com.tms.homework.nikitaelenski.task30.generative.prototype;

public class DogControl {
    public static void main(String[] args) {

        Dog master = new Dog(10, "жора", "Гав-Гав");
        Dog mast = new Dog(12, "ник", "Гав-Гав");
        System.out.println(master);

        Dog masterClonebl = (Dog) master.copy();
        System.out.println(masterClonebl);

        MyDog myDog = new MyDog(master);
        Dog masterClone = myDog.cloneDog();
        System.out.println(masterClone);

        MyDog myDog1 = new MyDog(mast);
        Dog masterclo = myDog1.cloneDog();
        System.out.println(masterclo);
    }
}
