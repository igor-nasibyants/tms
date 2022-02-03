package com.tms.homework.asilius1;

import java.util.Scanner;
import com.tms.homework.asilius1.task1.*;

public class Main {
    public static void main(String[] args) {

        int i;
        Scanner str = new Scanner(System.in);

        do {
            System.out.println("Меню выбора задания, введите из клавиатуры число из списка:");
            System.out.println("1. Задание с побитовыми операциями.");
            System.out.println("0. Выход");

            i = str.nextInt();

            switch (i){
                case 1:
                    Enter.menu();
                    break;

                case 0:
                    break;
            }
        }
        while (i!=0);
    }
}
