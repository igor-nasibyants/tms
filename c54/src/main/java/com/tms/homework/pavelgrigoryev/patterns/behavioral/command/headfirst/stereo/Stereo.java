package com.tms.homework.pavelgrigoryev.patterns.behavioral.command.headfirst.stereo;

public class Stereo {
    String room;

    public Stereo(String room) {
        this.room = room;
    }

    public void on() {
        System.out.println("Гук уключон!");
    }

    public void off() {
        System.out.println("Гук выключон!");
    }

    public void setCd() {
        System.out.println("Дыск устаулен!");
    }

    public void setVolume(int volume) {
        System.out.println("Гук урублен на " + volume);
    }

    @Override
    public String toString() {
        return "Stereo{" +
                "room='" + room + '\'' +
                '}';
    }
}
