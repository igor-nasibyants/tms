package org.mycompany.han;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@WebServlet("/addTask")
public class AddTask extends HttpServlet {
    public void doGet(HttpServletRequest httpServletRequest,
                      HttpServletResponse httpServletResponse)
            throws IOException {
        httpServletResponse.setContentType("text/html;charset=UTF-8");
        List<Task> tasks = getTasks();
        try (PrintWriter out = httpServletResponse.getWriter()) {
            out.append("<ul>");
            for (Task task : tasks) {
                out.append("<li>")
                        .append(String.valueOf(task.getId()))
                        .append("<br>Name:")
                        .append(task.getNameTask()).append("<br>Status:")
                        .append(String.valueOf(task.isStatus())).append("</li>");
            }
            out.append("</ul>");
        }
    }

    public static List<Task> getTasks() {
        List<Task> tasks = new ArrayList<>();
        final String url = "jdbc:mysql://localhost/tododb";
        final String username = "mysql";
        final String password = "mysql";
        ResultSet resultSet = null;
        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            Statement statement = connection.createStatement();
            try {
                resultSet = statement.executeQuery("select * from task");
            } catch (SQLException e) {
                e.printStackTrace();
            }
            while (Objects.requireNonNull(resultSet).next()) {
                Task task = new Task();
                task.setId(resultSet.getInt("id"));
                task.setNameTask(resultSet.getString("name"));
                task.setStatus(resultSet.getBoolean("status"));
                tasks.add(task);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return tasks;
    }

    public static void main(String[] args) {
        System.out.println(getTasks());
    }
}