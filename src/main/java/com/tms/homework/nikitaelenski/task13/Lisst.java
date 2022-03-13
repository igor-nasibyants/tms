package com.tms.homework.nikitaelenski.task13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;


public class Lisst {

    public static void main(String[] args) {

        LinkedList<String> arrStr = new LinkedList<>();

        arrStr.add("имя");
        arrStr.add("Фамилия");
        arrStr.add("Отчевтво");
        arrStr.add("Возрост");
        System.out.println(arrStr.peekFirst());
        arrStr.addFirst("изменения");
        System.out.println(arrStr.peekFirst());
        String[] arr = arrStr.toArray(new String[10]);
        for (String num : arr) {
            System.out.println(num);
        }

    }
}

