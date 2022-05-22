package com.tms.homework.han.patterns.structural.bridge;

public class EmailSender extends Sender{
    public EmailSender(DateRead read) {
        super(read);
    }

    @Override
    public void send() {
        read.read();
        System.out.println("Отправка по e-mail");
    }
}
