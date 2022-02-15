package com.tms.homework.staryyo.task6;

public class Main {

        public static void main(String[]args){
            Person vasya = new Person(186, 32);
            vasya.setAge(vasya.getAge() + 1);
            vasya.say ("Витек");
            System.out.println(vasya.getHeight());
            System.out.println(vasya.getAge());


        }

}
