package com.tms.homework.pavelgrigoryev.patterns.behavioral.command.headfirst.garagedoor;

public class GarageDoor {
    String room;

    public GarageDoor(String room) {
        this.room = room;
    }

    public void up() {
        System.out.println("Дзвер адчыняецца!");
    }

    public void down() {
        System.out.println("Дзвер зачыняецца!");
    }

    @Override
    public String toString() {
        return "GarageDoor{" +
                "room='" + room + '\'' +
                '}';
    }
}
