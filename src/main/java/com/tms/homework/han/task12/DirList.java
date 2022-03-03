package com.tms.homework.han.task12;

import java.io.*;

public class DirList {

    public static void main(String[] args) {
        try {
            File path = new File("D:\\Java\\tms\\src\\main\\java\\com\\tms\\homework\\han");
            String[] list = Tree.getList(args, path);
            for (String dirItem : list) {
                System.out.println(dirItem);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
