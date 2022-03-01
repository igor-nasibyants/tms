package com.tms.task.task12;

import java.io.File;
import java.util.Arrays;

public class FileExample {

    public static void main(String[] args) {
        printDirList();
    }

    private static void printDirList() {
        File path = new File("src\\.");
        String[] list = path.list();
        Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
        for (String f : list) {
            System.out.println(f);
        }
    }
}
