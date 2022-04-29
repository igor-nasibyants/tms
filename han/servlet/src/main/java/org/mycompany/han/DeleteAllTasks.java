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

@WebServlet("/deleteAll")
public class DeleteAllTasks extends HttpServlet {

    final String url = "jdbc:mysql://localhost/tododb";
    final String username = "mysql";
    final String password = "mysql";
    public void doPost(HttpServletRequest httpServletRequest,
                       HttpServletResponse httpServletResponse) throws ServletException, IOException {
        List<Task> tasks = getTasks();
        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            Statement statement = connection.createStatement();
            statement.executeUpdate("TRUNCATE TABLE task");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        httpServletRequest.setAttribute("tasks", tasks);
        getServletContext().getRequestDispatcher("/index.jsp").forward(httpServletRequest, httpServletResponse);
    }
}