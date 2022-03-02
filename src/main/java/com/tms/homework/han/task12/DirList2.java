package com.tms.homework.han.task12;

import java.util.regex.*;
import java.io.*;
import java.util.*;

public class DirList2 {
    public static FilenameFilter filter(final String regex) {
        return new FilenameFilter() {
            private final Pattern pattern = Pattern.compile(regex);

            @Override
            public boolean accept(File file, String s) {
                return pattern.matcher(s).matches();
            }
        };
    }

    public static void main(String[] args) {
        File path = new File(".\\src\\main\\java\\com\\tms\\homework\\han\\task12");
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
