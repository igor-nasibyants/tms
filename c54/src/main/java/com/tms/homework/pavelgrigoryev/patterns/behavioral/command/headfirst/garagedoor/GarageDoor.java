package com.tms.homework.pavelgrigoryev.patterns.behavioral.command.headfirst.garagedoor;

public class GarageDoor {
    String room;

    public GarageDoor(String room) {
        this.room = room;
    }

    public void up() {
        System.out.println("Дзвер адчыняецца! у " + room);
    }

    public void down() {
        System.out.println("Дзвер зачыняецца! у " + room);
    }
}
