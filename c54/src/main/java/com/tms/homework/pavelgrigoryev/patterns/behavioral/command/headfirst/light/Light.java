package com.tms.homework.pavelgrigoryev.patterns.behavioral.command.headfirst.light;

public class Light {
    String room;

    public Light(String room) {
        this.room = room;
    }

    public void on() {
        System.out.println("Лампочка горыть");
    }

    public void off() {
        System.out.println("Лампочка не горыть");
    }

    @Override
    public String toString() {
        return "Light{" +
                "room='" + room + '\'' +
                '}';
    }
}
