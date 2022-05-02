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

@WebServlet("/markCompletedTask")
public class CompletedTask extends HttpServlet {

    final String url = "jdbc:mysql://localhost/tododb";
    final String username = "mysql";
    final String password = "mysql";

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("checkTask"));
        List<Task> tasks = getTasks();
        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            if (tasks.get(id - 1).isStatus()) {
                try (final PreparedStatement statement =
                             connection.prepareStatement("UPDATE task SET status = '0' WHERE id = ?")) {
                    statement.setInt(1, id);
                    statement.executeUpdate();
                }
            } else {
                try (final PreparedStatement statement =
                             connection.prepareStatement("UPDATE task SET status = '1' WHERE id = ?")) {
                    statement.setInt(1, id);
                    statement.executeUpdate();
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        resp.sendRedirect("/all.jsp");
        resp.getWriter().println(id);
    }
}
