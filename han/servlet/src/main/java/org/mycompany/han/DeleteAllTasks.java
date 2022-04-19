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
import java.sql.*;

import static org.mycompany.han.UtilsFunction.*;

@WebServlet("/deleteAll")
public class DeleteAllTasks extends HttpServlet {

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

    public void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {
        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            Statement statement = connection.createStatement();
            statement.executeUpdate("TRUNCATE TABLE task");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        updateTodo(httpServletResponse, HTMLString, getTasks(), element);
    }
}