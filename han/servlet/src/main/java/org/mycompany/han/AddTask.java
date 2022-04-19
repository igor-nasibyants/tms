package org.mycompany.han;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.sql.*;
import java.util.List;

import static org.mycompany.han.UtilsFunction.*;

@WebServlet("/addTask")
public class AddTask extends HttpServlet {

    //Разобраться с путями
    String HTMLString;

    {
        try {
            HTMLString = String.valueOf(Jsoup.parse(new File("D:\\Java\\TMS\\tms\\han\\servlet\\src\\main\\webapp\\index.jsp"),
                    "ISO-8859-1"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    final String url = "jdbc:mysql://localhost/tododb";
    final String username = "mysql";
    final String password = "mysql";
    Document html = Jsoup.parseBodyFragment(HTMLString);
    Element element = html.getElementById("tasks");

    public void doGet(HttpServletRequest httpServletRequest,
                      HttpServletResponse httpServletResponse) {
        String nameTask = null;
        try {
            httpServletRequest.setCharacterEncoding("utf-8");
            nameTask = httpServletRequest.getParameter("nameTask");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
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
        updateTodo(httpServletResponse, HTMLString, getTasks(), element);
    }
}