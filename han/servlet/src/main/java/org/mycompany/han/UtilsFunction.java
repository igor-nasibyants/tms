package org.mycompany.han;

import org.jsoup.nodes.Element;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class UtilsFunction {
    public static void updateTodo(HttpServletResponse httpServletResponse,
                                     String HTMLString, List<Task> tasks, Element element) {
        try (PrintWriter out = httpServletResponse.getWriter()) {
            out.append(HTMLString);
            out.append("<h4>");
            tasks.forEach(task -> out.append("<br>")
                    .append(String.valueOf(task.getId()))
                    .append(") ")
                    .append(task.getNameTask())
                    .append(". Status: ")
                    .append(String.valueOf(task.isStatus())));
            out.append("</h4>");
            element.append(String.valueOf(out));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

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
                    while (Objects.requireNonNull(resultSet).next()) {
                        Task task = new Task();
                        task.setId(resultSet.getInt("id"));
                        task.setNameTask(resultSet.getString("name"));
                        task.setStatus(resultSet.getBoolean("status"));
                        tasks.add(task);
                    }
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
}
