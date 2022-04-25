package org.mycompany.han;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;
import java.util.List;

import static org.mycompany.han.UtilsFunction.*;

@WebServlet("/addTask")
public class AddTask extends HttpServlet {

    final String url = "jdbc:mysql://localhost/tododb";
    final String username = "mysql";
    final String password = "mysql";
    public void doGet(HttpServletRequest httpServletRequest,
                      HttpServletResponse httpServletResponse) throws ServletException, IOException {
        List<Task> tasks = getTasks();
        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            try (final PreparedStatement statement =
                         connection.prepareStatement("insert task(id, name, status)" +
                                 " value(?, ?, false)")) {
                statement.setInt(1, tasks.size() + 1);
                statement.setString(2, "nameTask");
                statement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        httpServletRequest.setAttribute("tasks", tasks);
        getServletContext().getRequestDispatcher("/index.jsp").forward(httpServletRequest, httpServletResponse);
    }
}