package org.mycompany.han;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import static org.mycompany.han.Task.getTasks;

@WebServlet("/addTask")
public class AddTask extends HttpServlet {

    final String url = "jdbc:mysql://localhost/tododb";
    final String username = "mysql";
    final String password = "mysql";

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        String taskName = req.getParameter("form2");
        String out = Character.toUpperCase(taskName.charAt(0)) + taskName.substring(1);
        List<Task> tasks = getTasks();
        if (out.trim().length() != 0) {
            try (Connection connection = DriverManager.getConnection(url, username, password)) {
                try (final PreparedStatement statement =
                             connection.prepareStatement("insert task(id, name, status)" +
                                     " value(?, ?, false)")) {
                    int id = tasks.size() == 0 ? 1 : tasks.get(tasks.size() - 1).getId() + 1;
                    statement.setInt(1, id);
                    statement.setString(2, out);
                    statement.executeUpdate();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            resp.sendRedirect("/all.jsp");
        } else {
            resp.sendRedirect("/all.jsp");
        }
    }
}