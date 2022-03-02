package com.tms.homework.han.task12;

import java.io.*;
import java.util.*;

import static com.tms.homework.han.task10.task4.Formatable.formatting;

public class Tree {
    public static void main(String[] args) {
        String tms = ".\\src\\main\\java\\com\\tms";
        String homework = ".\\src\\main\\java\\com\\tms\\homework";
        String han = ".\\src\\main\\java\\com\\tms\\homework\\han";
        String[] treeList = new String[]{tms, homework, han};
        try {
            for (String a : treeList) {
                System.out.println("Folder: [" + a + "]");
                File path = new File(a);
                String[] list;
                if (args.length == 0) {
                    list = path.list();
                } else {
                    list = path.list(new DirFilter(args[0]));
                }
                assert list != null;
                Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
                Print.pPrint(list);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
