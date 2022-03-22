package com.tms.homework.staryyo.Task15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Heroes Odet = new Heroes("Odett", 6, "Easy");
        Heroes Zask = new Heroes("Zask", 5, "Medium");
        Heroes Aldous = new Heroes("Aldous", 9, "Hard");
        Heroes Lancelot = new Heroes("Lancelot", 10, "Hard");


    }

    public static void getHeroes(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isRepeat = true;
        while (isRepeat) {
            System.out.println("Enter name Hero/ введите имя героя");
            String nameHero = scanner.nextLine();
            System.out.println("Hero chose");
            break;
        }
    }
}

