package com.tms.homework.han.task9;

public class Main {
    public static void main(String[] args) {
        Man peterParker = new SpiderMan(25, 40, "Питер Паркер", "Нет :(");
        Man noName = new SpiderMan();
        Man milesMorales = new SpiderMan(10, 50, "Майлз Моралес", "Электричество и невидимость");
        Man nikitaGan = new SpiderMan(99, 99, "Никита Ган", "Управляет всеми стихиями, невидимость, контроль над разумом и т.п.");
        System.out.println(peterParker);
        System.out.println(noName);
        System.out.println(milesMorales);
        System.out.println(nikitaGan);
    }
}
