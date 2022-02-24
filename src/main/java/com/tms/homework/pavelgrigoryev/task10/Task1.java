package com.tms.homework.pavelgrigoryev.task10;

public class Task1 {
    public static void main(String[] args) {
        /*StringBuilder stringBuilder = new StringBuilder("""
                От печали я очнулся и невольно усмехнулся,
                Видя важность этой птицы, жившей долгие года.
                «Твой хохол ощипан славно и глядишь ты презабавно»,
                Я промолвил, «но скажи мне: в царстве тьмы, где ночь всегда,
                Как ты звался, гордый Ворон, там, где ночь царит всегда!»
                Молвил Ворон: «Никогда».""");
        print(stringBuilder);*/
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
