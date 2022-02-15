package com.tms.homework.nikitaelenski.task7;

public class Dog {
    private int size;
    private String bread;
    private String name;

    public void bark() {
        if (size > 60) {
            System.out.println("Гав! Гав! " + name);
        } else if (size > 20) {
            System.out.println("Вуф! Вуф! " + name);
        } else {
            System.out.println("Тяф! Тяф! " + name);
        }
    }

    public void barkReapeat(int numOfBark) {
        while (numOfBark > 0) {
            bark();
            numOfBark--;
        }
    }


    public Dog(int size, String bread, String name) {
        this.size = size;
        this.bread = bread;
        this.name = name;
    }

    public Dog() {
    }

    @Override
    public String toString() {
        return "Dog{" +
                "size=" + size +
                ", bread='" + bread + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
