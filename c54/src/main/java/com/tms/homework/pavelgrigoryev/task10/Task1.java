package com.tms.homework.pavelgrigoryev.task10;

public class Task1 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("От печали я очнулся и невольно усмехнулся,\n" +
                "Видя важность этой птицы, жившей долгие года.\n" +
                "«Твой хохол ощипан славно и глядишь ты презабавно»,\n" +
                "Я промолвил, «но скажи мне: в царстве тьмы, где ночь всегда,\n" +
                "Как ты звался, гордый Ворон, там, где ночь царит всегда!»\n" +
                "Молвил Ворон: «Никогда».");
        print(stringBuilder);
    }
    private static void print(StringBuilder stringBuilder) {
        separator();
        System.out.println(stringBuilder);
        separator();
        System.out.println("Вырезанный текст от символа \"я\" до символа \"ж\" : ");
        separator();
        System.out.println(stringBuilder.substring(stringBuilder.indexOf("я"), stringBuilder.indexOf("ж")));
        separator();
    }
    public static void separator() {
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
    }
}
