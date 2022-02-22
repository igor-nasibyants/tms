package com.tms.homework.nikitaelenski.task7;

import java.util.Random;

public class SausageDoge extends Dog implements Iron, Feed {
    private boolean hungry;
    private int i;

    public SausageDoge(Integer size, String eat, String name, boolean hungry) {
        super(size, eat, name);
        this.hungry = hungry;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public String sayDontEat() {
        return super.sayDontEat();
    }

    public void TouchTheDog() {
        if (getSize() > 60) {
            System.out.println("Опастно трогать");
        } else if (getSize() > 30) {
            System.out.println("Можно попробывать");
        } else {
            System.out.println("Гладь смело");
        }
    }

    public void eatTheDog() {
        Random rnd = new Random();
        i = rnd.nextInt(10);
        for (int x = 0; x < i; x++) {
            if (hungry) {
                System.out.println("Покорми меня , меня зовут  " + getName() + " Я очень люблю ," + getEat());
            } else {
                System.out.println("Я не голодный");
                break;
            }
        }
    }
}

