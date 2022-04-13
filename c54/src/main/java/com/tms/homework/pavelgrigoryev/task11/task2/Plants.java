package com.tms.homework.pavelgrigoryev.task11.task2;

/*2. Create a class Plants, which includes fields int size, Color - color
        and Type - type, and constructor where these fields are initialized.
        Color and type are Enum. Override the method toString( ).
        Create classes ColorException and TypeException and
        describe there all possible colors and types of plants. In the
        method main create an array of five plants. Check to work your
        exceptions.*/

public class Plants {
    int size;
    Color color;
    Type type;

    public Plants(int size, Color color, Type type) {
        this.size = size;
        this.color = color;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Plants{" +
                "size=" + size +
                ", color=" + color +
                ", type=" + type +
                '}';
    }
}
