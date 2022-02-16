package com.tms.homework.han.task8.encapsulation;

public class Chordal extends Animal {
    boolean chord;


    public Chordal(int paws, int teeth, String sound, boolean chord) {
        super(paws, teeth, sound);
        this.chord = chord;
    }
}
