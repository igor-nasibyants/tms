package com.tms.homework.pavelgrigoryev.task20.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectFromInJDBC {
    public static void main(String[] args) {
        try {
            String url = "jdbc:mysql://localhost/store";
            String username = "root";
            String password = "ваш пароль";
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();

            try (Connection connection = DriverManager.getConnection(url, username, password)) {
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery("select * from products");
                while (resultSet.next()) {
                    int id = resultSet.getInt(1);
                    String name = resultSet.getString(2);
                    int price = resultSet.getInt(3);
                    System.out.printf("%d. %s - %d \n", id, name, price);
                }
            }
        } catch (Exception e) {
            System.out.println("Connection failed...");
            System.out.println(e);
        }
    }
}