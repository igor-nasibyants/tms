package com.tms.homework.pavelgrigoryev.task10;

public class Task2 extends Task1 {
    public static void main(String[] args) {
/*        String string = """
                I am a world before I am a man
                I was a creature before I could stand
                I will remember before I forget
                Before I forget that
                I am a world before I am a man
                I was a creature before I could stand
                I will remember before I forget
                Before I forget that""";
        print(string);*/
    }
    private static void print(String string) {
        separator();
        System.out.println(string);
        separator();
        System.out.println("Заменены все вхождения символа стоящего в позиции(3) на символ стоящий в позиции(0) : ");
        separator();
        System.out.println(string.replace(String.valueOf(string.charAt(3)),String.valueOf(string.charAt(0))));
        separator();
    }
}
