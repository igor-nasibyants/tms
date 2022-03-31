package com.tms.homework.nikitaelenski.task16;

import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

    var s = 1;
    var d = 6;
        System.out.println(addition(s,d));
        IntStream.rangeClosed(0, addition(s, d))
                .mapToObj(end -> "Var так работает")
                .forEach(System.out::println);

        IntStream.rangeClosed(s , d)
                .forEach(j-> System.out.print(" -> " + j ));
    }




    public static Integer addition(int a ,int b ){
        int x = a + b ;
        return x;
    }
        }
