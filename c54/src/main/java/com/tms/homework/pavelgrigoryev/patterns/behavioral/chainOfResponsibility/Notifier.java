package com.tms.homework.pavelgrigoryev.patterns.behavioral.chainOfResponsibility;

public abstract class Notifier {
    private final int priority;
    private Notifier nextNotifier;

    public Notifier(int priority) {
        this.priority = priority;
    }

    public void setNextNotifier(Notifier nextNotifier) {
        this.nextNotifier = nextNotifier;
    }

    public void notifyManager(String message, int level) {
        if (level >= priority) {
            write(message);
        }
        if (nextNotifier != null) {
            nextNotifier.notifyManager(message, level);
        }
    }

    public abstract void write(String message);
}
