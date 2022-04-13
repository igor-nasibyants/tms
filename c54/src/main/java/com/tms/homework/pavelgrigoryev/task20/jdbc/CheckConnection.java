package com.tms.homework.pavelgrigoryev.task20.jdbc;

public class CheckConnection {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            System.out.println("Connection successful !");
        } catch (Exception e) {
            System.out.println("Connection failed...");
        }
    }
}
