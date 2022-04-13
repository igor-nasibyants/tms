package com.tms.homework.han.task10;

public class Task2 {
    public static void main(String[] args) {
        String sb = "English texts for beginners to practice reading and comprehension online " +
                "and for free. Practicing your comprehension of written English will both improve your vocabulary and " +
                "understanding of grammar and word order. The texts below are designed to help you develop while giving" +
                " you an instant evaluation of your progress.";
        System.out.println(sb.replace(String.valueOf(sb.charAt(3)), String.valueOf(sb.charAt(0))));
    }
}
