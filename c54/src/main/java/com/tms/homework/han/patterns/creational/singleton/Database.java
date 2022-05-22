package com.tms.homework.han.patterns.creational.singleton;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class Database {
    private static Database databaseConnection;
    private final String url = "jdbc:mysql://localhost/tododb";
    private final String username = "mysql";
    private final String password = "mysql";

    private Database() {
        System.out.println("Connect to DB");
    }

    public static Database getConnection() {
        if (databaseConnection == null) {
            databaseConnection = new Database();
        }
        return databaseConnection;
    }

    public void insertData(String data) {
        System.out.println("Added " + data + " to DB");
        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            try (final PreparedStatement statement =
                         connection.prepareStatement("insert task(name, status)" +
                                 " value(?, false)")) {
                statement.setString(1, data);
                statement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    private Statement getStatement() {
        Statement statement = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            try (Connection connection = DriverManager.getConnection(url, username, password)) {
                statement = connection.createStatement();
                statement.close();
            } catch (Exception e) {
                System.err.println("Ошибка подключения к БД");
                e.printStackTrace();
            }
        } catch (Exception e) {
            System.err.println("Ошибка регистрации драйвера");
            e.printStackTrace();
        }
        return statement;
    }

    public void selectData() {
        List<Task> tasks = new ArrayList<>();
        ResultSet resultSet;
        try {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
                try (Connection connection = DriverManager.getConnection(url, username, password)) {
                    Statement statement = connection.createStatement();
                    resultSet = statement.executeQuery("select * from task");
                    while (Objects.requireNonNull(resultSet).next()) {
                        Task task = new Task();
                        task.setId(resultSet.getInt("id"));
                        task.setName(resultSet.getString("name"));
                        task.setStatus(resultSet.getBoolean("status"));
                        tasks.add(task);
                    }
                } catch (
                        SQLException e) {
                    System.err.println("Ошибка записи из БД в массив");
                    e.printStackTrace();
                }
            } catch (Exception e) {
                System.err.println("Ошибка подключения к БД");
                e.printStackTrace();
            }
        } catch (Exception e) {
            System.err.println("Ошибка регистрации драйвера");
            e.printStackTrace();
        }
        tasks.forEach(task -> System.out.println(task.id + ") " + task.name + " is " + task.status));
    }
}