package com.tms.homework.han.task17;

import java.util.regex.*;

public class Regex {

    public static void main(String[] args) {
        changeMail();
        changeYear();
    }

    public static void changeMail() {
        Pattern p = Pattern.compile("[a-zA-Z\\d]+\\.[a-zA-Z]{2,}");
        Matcher m = p.matcher("My e-mail is helloworld@gmail.com, but password i won't give com you");
        System.out.println(m.replaceAll("belmail\\.by"));
    }

    public static void changeYear() {
        Pattern p = Pattern.compile("(\\d{1,2})\\.(\\d{1,2})\\.(\\d{1,4})");
        String date = "25.12.2009";
        Matcher m = p.matcher(date);
        System.out.println(m.replaceAll("$1-$2-$3"));
    }
}
