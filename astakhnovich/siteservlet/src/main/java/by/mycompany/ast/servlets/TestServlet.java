package by.mycompany.ast.servlets;

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

import static by.mycompany.ast.servlets.Test.getTest;

@WebServlet("/testA")
public class TestServlet extends HttpServlet {

    final String url = "jdbc:mysql://localhost/tododb";
    final String username = "mysql";
    final String password = "mysql";

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String loginTest = req.getParameter("inputLoginTest");
        String passwordTest = req.getParameter("inputPasswordTest");
        List<Test> testList = getTest();
        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            try (final PreparedStatement statement =
                         connection.prepareStatement("insert user(id, username, password)" +
                                 " value(?, ?, ?)")) {
                int id = testList.size() == 0 ? 1 : testList.size() + 1;
                statement.setInt(1, id);
                statement.setString(2, loginTest);
                statement.setString(3, passwordTest);
                statement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        resp.sendRedirect("views/list.jsp");
    }
}
