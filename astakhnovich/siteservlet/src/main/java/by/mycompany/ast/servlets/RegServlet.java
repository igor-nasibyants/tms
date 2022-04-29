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
import java.util.regex.Pattern;

@WebServlet("/reg")
public class RegServlet extends HttpServlet {
    private static final String PASSWORD_VALID = "(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])[\\w]{6,}";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("views/reg.jsp");
        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String login = req.getParameter("login");
        String password = req.getParameter("password");
        if(isValidPassword(password)) {
            User user = new User(name, login, password);
            Model model = Model.getInstance();
            model.add(user);
            resp.sendRedirect("/testservlet/login");
        }else {
            req.setAttribute("notValid", name);
            doGet(req, resp);
        }
    }

    private static boolean isValidPassword(String password){
        return Pattern.matches(PASSWORD_VALID, password);
    }
}