package org.mycompany.han.model;

import org.mycompany.han.logic.Speakable;

public class HumanSpeak extends Human implements Speakable {
    String message = "I'm a Human";
    public HumanSpeak(int age, String name) {
        super(age, name);
    }

    @Override
    public String speak() {
        return message;
    }
}
