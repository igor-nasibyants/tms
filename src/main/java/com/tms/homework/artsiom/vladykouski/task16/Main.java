package com.tms.homework.artsiom.vladykouski.task16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        new Main().took(Arrays.asList(9, 10, 15));
    }

            public void took(Object obj){
            if (obj instanceof List a) {
                a.set(2,16);
                System.out.printf("Содержимое коллекции + %s", a);
            }

            };
        }


