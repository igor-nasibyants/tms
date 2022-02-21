package com.tms.task.task10;

public class Main {

    public static void main(String[] args) {
        String s1 = "string 123";
        String s2 = new String("string 123");
        String s3 = new StringBuffer().append("string").append(" ").append("123").toString();
        String s4 = new String(new StringBuffer().append("string").append(" ").append("123"));
        String s5 = new StringBuilder().append("string").append(" ").append("123").toString();
        String s6 = new String(new StringBuilder().append("string").append(" ").append("123"));
    }
}
