package com.tms.homework.nikitaelenski.task12;

import java.util.Arrays;
import java.io.File;

public class Text {
    public static void printOut (String[] list){
        Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
        for (String print : list) {
            System.out.println(print);
        }
    }
}
