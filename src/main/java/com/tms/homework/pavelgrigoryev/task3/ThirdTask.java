package com.tms.homework.pavelgrigoryev.task3;

public class ThirdTask {
    public static void main(String[] args) {
        jump();
    }
    public static void jump() {
        int[] array ;
        int count = 0;
        for (int i = 0; i < 15; i++){
            array = new int[(int)(Math.random() * 99)];
            System.out.print(array.length + " ");
            if (array.length % 2 == 0) {
                count++;
            }
        }
        System.out.println();
        System.out.println("Количество четных элементов : " + count);
    }
}

