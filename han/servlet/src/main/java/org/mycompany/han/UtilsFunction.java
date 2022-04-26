package org.mycompany.han;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class UtilsFunction {
    public static List<Task> getTasks() {
        final String url = "jdbc:mysql://localhost/tododb";
        final String username = "mysql";
        final String password = "mysql";
        List<Task> tasks = new ArrayList<>();
        ResultSet resultSet;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            try (Connection connection = DriverManager.getConnection(url, username, password)) {
                Statement statement = connection.createStatement();
                try {
                    resultSet = statement.executeQuery("select * from task");
                    addToList(tasks, resultSet);
                } catch (SQLException e) {
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
        return tasks;
    }

    public static void addToList(List<Task> arr, ResultSet resultSet ) throws SQLException {
        while (Objects.requireNonNull(resultSet).next()) {
            Task task = new Task();
            task.setId(resultSet.getInt("id"));
            task.setNameTask(resultSet.getString("name"));
            task.setStatus(resultSet.getBoolean("status"));
            arr.add(task);
        }
    }
}
