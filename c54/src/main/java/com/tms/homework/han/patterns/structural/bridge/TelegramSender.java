package com.tms.homework.han.patterns.structural.bridge;

public class TelegramSender extends Sender {
    public TelegramSender(DateRead read) {
        super(read);
    }

    @Override
    public void send() {
        read.read();
        System.out.println("Отправка по телеграм");
    }
}
