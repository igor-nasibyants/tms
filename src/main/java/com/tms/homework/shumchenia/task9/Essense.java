package com.tms.homework.shumchenia.task9;

public abstract class Essense implements Moveable,Attackable{
    private int health;
    private int damage;
    private int endurance;
    private int x;
    private int y;
    private String sprite;

    public Essense(int health, int damage, int endurance, int x, int y,String sprite) {
        this.health = health;
        this.damage = damage;
        this.endurance = endurance;
        this.x = x;
        this.y = y;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public int getEndurance() {
        return endurance;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    protected void setHealth(int health) {
        this.health = health;
    }

    protected void setX(int x) {
        this.x = x;
    }

    protected void setY(int y) {
        this.y = y;
    }

    protected void setEndurance(int endurance) {
        this.endurance = endurance;
    }

    @Override
    public void moveLeft() {
        System.out.println("Переместился на одну клетку влево");
        setX(getX()-1);
    }

    @Override
    public void moveRight() {
        System.out.println("Переместился на одну клетку впрао");
        setX(getX()+1);
    }

    @Override
    public void moveUp() {
        System.out.println("Переместился на одну клетку вверх");
        setY(getY()+1);
    }

    @Override
    public void moveDown() {
        System.out.println("Переместился на одну клетку вниз");
        setY(getY()-1);
    }

    @Override
    public void attack()
    {
        if (getEndurance() > 9) {
            System.out.println("Атака");
            setEndurance(getEndurance() - 10);
        }
    }

    @Override
    public void takeDamage() {
        setHealth(getHealth()-20);
        if(getHealth()<1){
            System.out.println("убит");
        }
    }
}
