package com.tms.homework.shumchenia.task9;

public final class Hero extends Essense implements Jumpable{
    private int magicEndurance;
    public Hero(int health, int damage, int endurance, int x, int y, int magicEndurance, String sprite) {
        super(health, damage, endurance, x, y,sprite);
        this.magicEndurance = magicEndurance;

    }

    private int getMagicEndurance() {
        return magicEndurance;
    }

    private void setMagicEndurance(int magicEndurance) {
        this.magicEndurance = magicEndurance;
    }


    @Override
    public void jump() {
        if(magicEndurance>19) {
            System.out.println("Подпрыгнул на одну клетку");
            setMagicEndurance(getEndurance()-20);
        }
    }

}
