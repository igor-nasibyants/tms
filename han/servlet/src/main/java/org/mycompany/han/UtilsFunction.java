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
            out.append("<div class = \"d-flex flex-column gap-2\">");
            tasks.forEach(task -> {
                String mark = "<div class = \"d-flex justify-content-between" +
                        " gap-1 border border-danger py-2 px-4 rounded-3 text-break\"" +
                        " style = \"min-width: 150px \">";
                if (task.isStatus()) {
                    mark = "<div class = \"d-flex justify-content-between" +
                            " gap-1 border border-danger bg-danger py-2 px-4 rounded-3 text-break text-white\"" +
                            " style = \"min-width: 150px \">";
                }
                out.
                        append(mark)
                        .append("<div class = \"\">")
                        .append(String.valueOf(task.getId()))
                        .append(") ")
                        .append(task.getNameTask())
                        .append(".</div>")
                        .append("<div class = \"d-flex align-items-center\">")
                        .append("<input type=\"checkbox\" name=\"checkbox\"/>")
                        .append("</div>")
                        .append("</div>");
            });
            out.append("</div>");
            element.append(String.valueOf(out));
        } catch (
                IOException e) {
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

    public static void main(String[] args) {
        List<Task> tasks = getTasks();
        //        httpServletRequest.getParameter("checkbox") != null ||
    }
}
