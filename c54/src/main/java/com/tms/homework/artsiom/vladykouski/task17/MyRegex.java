package com.tms.homework.artsiom.vladykouski.task17;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.*;
import java.util.Scanner;

public class MyRegex {
    public static void main(String[] args) {
        boolean pat = Pattern.matches("art","My heart in the highland");
        System.out.println(pat);
        Pattern pat1 = Pattern.compile("heart");
        Matcher mat = pat1.matcher("My heart in the highland");
        while (mat.find()){
            System.out.println(mat.start()+ "  " + (mat.end()-1));
        }
        // regex мобильного телефона
        String mob = "^([+]?)(\\d{3}|\\d{2})([(]?(29)|(33)|(44)|(25)[)]?)(\\d{3}-?\\d{2}-?\\d{2})$";
        Pattern pat2 = Pattern.compile(mob);
        Scanner d = new Scanner(System.in);
        String number1;
        number1 = d.next();
        Matcher number2 = pat2.matcher(number1);

        System.out.println(number2);





    }
}
