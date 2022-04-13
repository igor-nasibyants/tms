package com.tms.homework.han.task9;

public class SpiderMan extends Man implements Crawlable, Flyable {

    private final String superPower;

    public SpiderMan(int power, int speed, String name, String superPower) {
        super(power, speed, name);
        this.superPower = superPower;
    }

    public SpiderMan() {
        this.superPower = "У тебя ничего нет";
    }


    @Override
    public String go() {
        return getSpeed() < 50 ? " Скорость: " + getSpeed() + " Ля ты черепаха" : " Скорость: " + getSpeed() + " Ух ты, шустрик";
    }

    @Override
    public String lifts() {
        return getPower() < 15 ? " Сила: " + getPower() + " (ты точно паучок?)" : " Сила: " + getPower() + " (ля каратист)";
    }

    @Override
    public String crawl() {
        return getSpeed() * 2 < 80 ? " ' Ухх понабрали в армию пауков...'" : "' Такие нужны xD'";
    }

    @Override
    public String fly() {
        return " Урааа ты можешь летать на паутине";
    }

    @Override
    public String toString() {
        if (!this.superPower.equals("У тебя ничего нет")) {
            return "Человек-паук - " + getName() +
                    ": Суперсила: " + superPower + ", " + fly() + ", " + lifts() + ", " + go();
        }
        return "Ты никто";
    }
}
