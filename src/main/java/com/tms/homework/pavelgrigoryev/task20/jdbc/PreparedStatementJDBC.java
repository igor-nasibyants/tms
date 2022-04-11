package com.tms.homework.pavelgrigoryev.task20.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class PreparedStatementJDBC {
    public static void main(String[] args) {
        try {
            String url = "jdbc:mysql://localhost/store";
            String username = "root";
            String password = "ваш пароль";
            Scanner scanner = new Scanner(System.in);

            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();

            System.out.print("Input product name : ");
            String name = scanner.nextLine();

            System.out.print("Input product price : ");
            int price = scanner.nextInt();

            try (Connection connection = DriverManager.getConnection(url, username, password)) {
                String sql = "insert into products (productname, price) values (?, ?)";
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setString(1, name);
                preparedStatement.setInt(2, price);

                int rows = preparedStatement.executeUpdate();
                System.out.println("Rows added : " + rows);
            }
        } catch (Exception e) {
            System.out.println("Connection failed...");
            System.out.println(e);
        }
    }
}
