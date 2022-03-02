package com.tms.homework.han.task12;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

class DirFilter implements FilenameFilter {
    private final Pattern pattern;

    public DirFilter(String regex) {
        pattern = Pattern.compile(regex);
    }
    public DirFilter(File regex) {
        pattern = Pattern.compile(String.valueOf(regex));
    }

    @Override
    public boolean accept(File file, String s) {
        return pattern.matcher(s).matches();
    }
}