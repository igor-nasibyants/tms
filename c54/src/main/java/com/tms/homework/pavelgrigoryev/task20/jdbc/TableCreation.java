package com.tms.homework.pavelgrigoryev.task20.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TableCreation {
    public static void main(String[] args) {
        try {
            String url = "jdbc:mysql://localhost/store";
            String username = "root";
            String password = "ваш пароль";
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            String sqlCommand = "create table products (id int primary key auto_increment, productname varchar(20), price int)";

            try (Connection connection = DriverManager.getConnection(url, username, password)) {
                Statement statement = connection.createStatement();
                statement.executeUpdate(sqlCommand);
                System.out.println("Database has been created!");
            }
        } catch (Exception ex) {
            System.out.println("Connection failed...");
            System.out.println(ex);
        }
    }
}
