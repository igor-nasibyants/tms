package com.tms.homework.nikitaelenski.mytodo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MyToDoList myToDoList = new MyToDoList();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Хотите что то записать " +
                "\n 1 - да " +
                "\n 2 - нет");
        if (scanner.hasNextInt()) {
            int x = scanner.nextInt();
            while (true) {
                if (1 == x) {
                    myToDoList.creat();
                } else {
                    break;
                }
            }
        } else if (scanner.hasNextLine()) {
            System.err.println("Не корректный ввод ");
        }
    }

}
