package com.tms.homework.artsiom.vladykouski.task10.task1;

public class Task2 {
    public static void main (String [] args){
        // 2) Заменить все вхождения символа стоящего в позиции (3) на сивол стоящий в позиции 0
        StringBuffer s = new StringBuffer("Мой родны кут як ты мне мілы");
        int a;
        int b;
        char x = s.charAt(3);
        a = s.indexOf(String.valueOf(x),0);
        char y = s.charAt(0);
        s.replace(0,9,String.valueOf(y));
        System.out.print(s);

    }
}
