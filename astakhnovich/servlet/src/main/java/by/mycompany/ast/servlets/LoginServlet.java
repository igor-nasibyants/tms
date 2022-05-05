package by.mycompany.ast.servlets;

import by.mycompany.ast.entity.User;
import by.mycompany.ast.repo.UserRepo;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("views/login.jsp");
        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login = req.getParameter("login");
        String password = req.getParameter("password");

        User userIn = new User(login, password);

        if(UserRepo.select()
                .stream()
                .filter(v -> v.getLogin().contains(userIn.getLogin()))
                .anyMatch(v -> v.getPassword().equals(userIn.getPassword()))) {
                resp.sendRedirect("main");
        }else {
            req.setAttribute("notContainsUser", "User not found");
            doGet(req, resp);
        }
    }
}
