package com.tms.homework.han.task11.task2;

public class Plants {
    private int size;
    private Color color;

    public Type getType() {
        return type;
    }

    private final Type type;

    public Plants(int size, Color color, Type type) {
        this.size = size;
        this.color = color;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Plants" + " have size " + size + ", color " + color + ", type " + type;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

}
