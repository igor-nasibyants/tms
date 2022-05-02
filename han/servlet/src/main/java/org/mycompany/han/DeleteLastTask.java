package org.mycompany.han;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;
import java.util.List;

import static org.mycompany.han.Task.getTasks;

@WebServlet("/deleteLast")
public class DeleteLastTask extends HttpServlet {

    final String url = "jdbc:mysql://localhost/tododb";
    final String username = "mysql";
    final String password = "mysql";

    public void doPost(HttpServletRequest req,
                       HttpServletResponse resp) throws ServletException, IOException {
        List<Task> tasks = getTasks();
        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            try (final PreparedStatement statement =
                         connection.prepareStatement("DELETE FROM task WHERE id = ?")) {
                statement.setInt(1, tasks.size());
                statement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        resp.sendRedirect("/all.jsp");
    }
}
