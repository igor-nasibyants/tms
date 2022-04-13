package com.tms.homework.han.task8.encapsulation;

public class Bird extends Chordal {

    public Bird(int paws, int teeth, String sound, boolean chord) {
        super(paws, teeth, sound, chord);
    }


    public void fly() {
        if (!chord) {
            say();
        }
    }
}
