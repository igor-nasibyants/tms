package org.mycompany.han;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
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

    String HTMLString = "";

    {
        try {
            HTMLString = String.valueOf(Jsoup.parse(new File("D:\\Java\\TMS\\tms\\han\\servlet\\src\\main\\webapp\\index.jsp"),
                    "ISO-8859-1"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    Document html = Jsoup.parseBodyFragment(HTMLString);
    Element element = html.getElementById("form1");

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        String taskName = element.val();
        List<Task> tasks = getTasks();
        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            try (final PreparedStatement statement =
                         connection.prepareStatement("insert task(id, name, status)" +
                                 " value(?, ?, false)")) {
                statement.setInt(1, tasks.size() + 1);
                statement.setString(2, "taskName");
                statement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        req.setAttribute("tasks", tasks);
        getServletContext().getRequestDispatcher("/index.jsp").forward(req, resp);
    }
}