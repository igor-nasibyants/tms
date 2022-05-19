package com.tms.task.patterns.behavioral.mediator;

public class User2 extends Participant {

    private String name;
    private final ApnaChatRoom chat;

    public User2(ApnaChatRoom chat) {
        this.chat = chat;
    }

    @Override
    public void sendMsg(String msg) {
        this.chat.showMsg(msg, this);

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
