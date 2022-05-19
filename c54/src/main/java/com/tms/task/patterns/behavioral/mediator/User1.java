package com.tms.task.patterns.behavioral.mediator;

public class User1 extends Participant {

    private String name;
    private final ApnaChatRoom chat;

    public User1(ApnaChatRoom chat) {
        this.chat = chat;
    }

    @Override
    public void sendMsg(String msg) {
        chat.showMsg(msg, this);

    }

    @Override
    public void setname(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }


}
