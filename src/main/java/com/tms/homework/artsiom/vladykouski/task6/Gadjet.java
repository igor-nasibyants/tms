package com.tms.homework.artsiom.vladykouski.task6;

public class Gadjet {
    private String nameModel;
    private String color;
    private String price;

    static {
        System.out.println("alksdnkfkasdf");
    }

    public Gadjet(String nameModel, String color, String price) {
        this.nameModel = nameModel;
        this.color = color;
        this.price = price;
    }

    public String getNameModel() {
        return nameModel;
    }

    public void setNameModel(String nameModel) {
        this.nameModel = nameModel;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}





