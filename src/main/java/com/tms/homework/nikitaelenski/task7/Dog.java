package com.tms.homework.nikitaelenski.task7;

public abstract class Dog {
    private Integer size;
    private String eat;
    private String name;

    public Dog(Integer size, String eat, String name) {
        this.size = size;
        this.eat = eat;
        this.name = name;
    }
    public Dog() {

    }

    public String sayDontEat(){
        return ("А ну : брось");
    }

    @Override
    public String toString() {
        return "Собака {" +
                "Размера=" + size +
                ", Питаеться='" + eat +
                ", С именем='" + name +
                '}';
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public String getEat() {
        return eat;
    }

    public void setEat(String eat) {
        this.eat = eat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
