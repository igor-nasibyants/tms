package com.tms.homework.han.task8.inheritance;

public class Main {
    public static void main(String[] args) {
        Bird eagle = new Bird(2, 0, "assa", false);
        Cat barsik = new Cat();
        barsik.setTail("Big tail");
        System.out.println(barsik.getTail());
    }
}
