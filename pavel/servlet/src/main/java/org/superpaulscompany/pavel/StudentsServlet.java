package org.superpaulscompany.pavel;

import org.superpaulscompany.pavel.model.Student;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class StudentsServlet extends HttpServlet {
    private static final String URL = "jdbc:mysql://localhost/studentsc54";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "мой пороль";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html");
        PrintWriter printWriter = resp.getWriter();
        ArrayList<Student> studentArrayList = new ArrayList<>();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery("SELECT * FROM studentsc54");
                while (resultSet.next()) {
                    int id = resultSet.getInt(1);
                    String studentsName = resultSet.getString(2);
                    String studentsSurname = resultSet.getString(3);
                    Student student = new Student(id, studentsName, studentsSurname);
                    studentArrayList.add(student);
                }
            }
        } catch (Exception e) {
            printWriter.println("<html>" + "<h1>" + e + "</h1>" + "</html>");
        } finally {
            studentArrayList.forEach(x -> printWriter.println("<html>" + "<h1 style=\"color: darkred;text-align: center\">"
                    + x + "</h1>" + "</html>"));
        }
    }
}

