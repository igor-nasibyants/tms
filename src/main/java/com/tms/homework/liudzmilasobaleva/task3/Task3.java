package com.tms.homework.liudzmilasobaleva.task3;

public class Task3 {
    public static void main(String[] args) {
//выводим числа от 0 до 100, кратные 4

        //the looping statement for
        for (int a = 0; a <= 100; a++) {
            if (a % 4 == 0)
                System.out.println(a);
        }

        //the looping statement while
        int b = 0;
        while (b <= 100) {
            if (b % 4 == 0)
                System.out.println(b);
            b++;
        }

        //the looping statement do-while
        int c = 0;
        do {
            if (c % 4 == 0)
                System.out.println(c);
            c++;
        } while (c <= 100);
    }
}
