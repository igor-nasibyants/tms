package com.tms.homework.han.task12;

import java.io.*;
import java.util.*;

public class Tree {
    public static void main(String[] args) {
        String tms = ".\\src\\main\\java\\com\\tms";
        String homework = ".\\src\\main\\java\\com\\tms\\homework";
        String han = ".\\src\\main\\java\\com\\tms\\homework\\han";
        String[] treeList = new String[]{tms, homework, han};
        try {
            for (String dirItem : treeList) {
                System.out.println("Folder: [" + dirItem + "]");
                File path = new File(dirItem);
                String[] list = getList(args, path);
                Print.pPrint(list);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String[] getList(String[] args, File file) {
        String[] list;
        if (args.length == 0) {
            list = file.list();
        } else {
            list = file.list(new DirFilter(args[0]));
        }
        assert list != null;
        Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
        return list;
    }

}
