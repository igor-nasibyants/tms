package com.tms.homework.artsiom.vladykouski.task10;

public class Task1 {
    public static void main (String [] args){
        /* 1) Вырезать подстроку из строки начиная с первого вхождения символа(А) до,
        последнего вхождения сивола(B).
         */
        StringBuilder s = new StringBuilder("Мой родны кут як ты мне мілы");
        int a;
        int b;
        // использовал другие символы, которые встречаются в тексте
        a = s.indexOf("й");
        b = s.lastIndexOf("н");
        System.out.print(s.delete(a,b));
    }
}
