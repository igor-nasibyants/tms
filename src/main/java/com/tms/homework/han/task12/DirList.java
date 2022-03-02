package com.tms.homework.han.task12;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class DirList {
    public static void main(String[] args) {
        File path = new File("D:\\Java\\tms\\src\\main\\java\\com\\tms\\homework\\han");
        String[] list;
        if (args.length == 0) {
            list = path.list();
        } else {
            list = path.list(new DirFilter(args[0]));
        }
        assert list != null;
        Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
        for (String dirItem : list) {
            System.out.println(dirItem);
        }
    }
}
