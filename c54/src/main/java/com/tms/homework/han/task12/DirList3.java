package com.tms.homework.han.task12;

import java.util.regex.*;
import java.io.*;
import java.util.*;

public class DirList3 {
    public static void main(String[] args) {
        File path = new File(".\\src\\main\\java\\com\\tms\\homework\\han\\task12");
        String[] list;
        if (args.length == 0) {
            list = path.list();
        } else {
            list = path.list(new FilenameFilter() {
                private final Pattern pattern = Pattern.compile(args[0]);

                @Override
                public boolean accept(File file, String s) {
                    return pattern.matcher(s).matches();
                }
            });
        }
        assert list != null;
        Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
        for (String dirItem : list) {
            System.out.println(dirItem);
        }
    }
}
