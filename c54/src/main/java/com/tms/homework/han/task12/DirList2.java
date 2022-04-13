package com.tms.homework.han.task12;

import java.io.*;

public class DirList2 {

    public static void main(String[] args) {
        File path = new File(".\\src\\main\\java\\com\\tms\\homework\\han\\task12");
        String[] list = Tree.getList(args, path);
        for (String dirItem : list) {
            System.out.println(dirItem);
        }
    }
}
