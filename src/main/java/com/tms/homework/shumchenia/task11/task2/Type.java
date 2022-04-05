package com.tms.homework.shumchenia.task11.task2;

public enum Type {
    ROSES("Розы"),
    CORNFLOWERS("Васильки"),
    CHAMOMILE("Ромашки");
    private String type;

    Type(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Type{" +
                "type='" + type + '\'' +
                '}';
    }
}
