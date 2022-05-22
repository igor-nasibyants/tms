package com.tms.homework.han.patterns.structural.bridge;

public class Main {
    public static void main(String[] args) {
        Sender sender = new EmailSender(new DataBaseReader());
        sender.send();

        sender.setRead(new FileReader());
        sender.send();

        sender = new TelegramSender(new DataBaseReader());
        sender.send();
    }
}
