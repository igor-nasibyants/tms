package org.mycompany.han;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


@WebServlet("/showAll")
public class ShowAllTasks extends HttpServlet {

    String HTMLString;

    {
        try {
            HTMLString = Jsoup.parse(
                    new File("D:\\Java\\TMS\\tms\\han\\servlet\\src\\main\\webapp\\index.jsp"),
                    "UTF-8").toString();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    Document html = Jsoup.parse(Objects.requireNonNull(HTMLString));
    Element element = html.getElementById("tasks");

    public void doGet(HttpServletRequest httpServletRequest,
                      HttpServletResponse httpServletResponse)
            throws IOException {
        httpServletResponse.setContentType("text/html;charset=UTF-8");
        List<Task> tasks = getTasks();
        try (PrintWriter out = httpServletResponse.getWriter()) {
            out.append(HTMLString);
            out.append("<h4>");
            tasks.forEach(task -> out.append("<br>")
                    .append(String.valueOf(task.getId()))
                    .append(") ")
                    .append(task.getNameTask())
                    .append(". Status: ")
                    .append(String.valueOf(task.isStatus())));
            out.append("</h4>");
            element.append(String.valueOf(out));
        }
    }

    public static List<Task> getTasks() {
        List<Task> tasks = new ArrayList<>();
        final String url = "jdbc:mysql://localhost/tododb";
        final String username = "mysql";
        final String password = "mysql";
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
                } catch (Exception e) {
                    System.err.println("Невозможно выбрать таблицу из БД");
                    e.printStackTrace();
                }
            }
        } catch (Exception ex) {
            System.err.println("Невозможно зарегестрировать драйвер");
            ex.printStackTrace();
        }
        return tasks;
    }

    public static void main(String[] args) {
        System.out.println(getTasks());
    }
}
