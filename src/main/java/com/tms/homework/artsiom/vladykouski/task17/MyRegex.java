package com.tms.homework.artsiom.vladykouski.task17;
import java.util.regex.*;

public class MyRegex {
    public static void main(String[] args) {
        boolean pat = Pattern.matches("art","My heart in the highland");
        System.out.println(pat);
        Pattern pat1 = Pattern.compile("heart");
        Matcher mat = pat1.matcher("My heart in the highland");
        while (mat.find()){
            System.out.println(mat.start()+ "  " + (mat.end()-1));
        }
    }
}
