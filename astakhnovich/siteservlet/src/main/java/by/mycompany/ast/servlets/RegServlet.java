package by.mycompany.ast.servlets;

import by.mycompany.ast.entitys.User;
import by.mycompany.ast.model.Model;
import javax.servlet.RequestDispatcher;
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
import java.util.regex.Pattern;

@WebServlet("/reg")
public class RegServlet extends HttpServlet {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/site";
    private static final String USER = "root";
    private static final String PASS = "root";
    private static final String PASSWORD_VALID = "(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])[\\w]{6,}";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("views/reg.jsp");
        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login = req.getParameter("login");
        String password = req.getParameter("password");
//        if(isValidPassword(password)) {
        User user = new User(login, password);
//        Repo.insert(user);
        if(ebanaBaza(user)) {
            resp.sendRedirect("/siteservlet/list");
        }else {
            resp.sendRedirect("/siteservlet/login");
        }

//        }else {
//            req.setAttribute("notValid", name);
//            doGet(req, resp);
//        }
    }

//    public static void main(String[] args) {
//        String login = "1";
//        String password = "1";
//        User user = new User(login, password);
//        System.out.println(ebanaBaza(user));
//    }

    static boolean ebanaBaza(User user){
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS)){
            try(PreparedStatement preparedStatement =
                        conn.prepareStatement("INSERT INTO users (login, password) VALUES (?, ?)")){
                preparedStatement.setString(1, user.getLogin());
                preparedStatement.setString(2, user.getPassword());
                preparedStatement.executeUpdate();
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    private static boolean isValidPassword(String password){
        return Pattern.matches(PASSWORD_VALID, password);
    }
}