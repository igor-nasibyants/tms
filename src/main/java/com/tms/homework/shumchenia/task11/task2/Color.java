package com.tms.homework.shumchenia.task11.task2;

public enum Color {

    WHITE("Белый"),
    BLACK("черный"),
    BLUE("Синий"),
    RED("Красный"),
    GREEN("Зеленый");

    private String color;

    private Color(String color){
        if("WHITE".equalsIgnoreCase(color)||"BLACK".equalsIgnoreCase(color)||"BLUE".equalsIgnoreCase(color)||
                "RED".equalsIgnoreCase(color)||"GREEN".equalsIgnoreCase(color)){this.color=color;}

    }

    @Override
    public String toString() {
        return "Color{" +
                "color='" + color + '\'' +
                '}';
    }
}
