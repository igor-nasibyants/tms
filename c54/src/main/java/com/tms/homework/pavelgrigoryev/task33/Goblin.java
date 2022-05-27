package com.tms.homework.pavelgrigoryev.task33;

import java.util.List;
import java.util.Objects;

public class Goblin implements Cloneable {
    private String name;
    private String skinColor;
    private Integer age;
    private Double cash;
    private List<Weapon> weapons;

    public Goblin(String name, String skinColor, Integer age, Double cash, List<Weapon> weapons) {
        this.name = name;
        this.skinColor = skinColor;
        this.age = age;
        this.cash = cash;
        this.weapons = weapons;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSkinColor() {
        return skinColor;
    }

    public void setSkinColor(String skinColor) {
        this.skinColor = skinColor;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getCash() {
        return cash;
    }

    public void setCash(Double cash) {
        this.cash = cash;
    }

    public List<Weapon> getWeapons() {
        return weapons;
    }

    public void setWeapons(List<Weapon> weapons) {
        this.weapons = weapons;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Goblin goblin = (Goblin) o;
        return Objects.equals(name, goblin.name) && Objects.equals(skinColor, goblin.skinColor)
                && Objects.equals(age, goblin.age) && Objects.equals(cash, goblin.cash)
                && Objects.equals(weapons, goblin.weapons);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, skinColor, age, cash, weapons);
    }

    @Override
    public Goblin clone() throws CloneNotSupportedException {
        return (Goblin) super.clone();
    }

    @Override
    public String toString() {
        return "Goblin{" +
                "name='" + name + '\'' +
                ", skinColor='" + skinColor + '\'' +
                ", age=" + age +
                ", cash=" + cash +
                ", weapons=" + weapons +
                '}';
    }
}
