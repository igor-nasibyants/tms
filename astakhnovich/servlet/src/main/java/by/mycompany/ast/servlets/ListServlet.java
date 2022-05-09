package by.mycompany.ast.servlets;

import by.mycompany.ast.entity.User;
import by.mycompany.ast.repo.UserRepo;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/userList")
public class ListServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        req.setAttribute("name", ((User)session.getAttribute("user")).getName());
        req.setAttribute("userList", UserRepo.select());
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("views/userList.jsp");
        requestDispatcher.forward(req, resp);
    }
}