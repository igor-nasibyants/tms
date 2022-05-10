package by.mycompany.ast.servlets.loginservlets;

import by.mycompany.ast.entity.User;
import by.mycompany.ast.repo.UserRepo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/delete")
public class DeleteServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession(false);
        if(UserRepo.delete(((User)session.getAttribute("user")).getId())){
            session.invalidate();
            resp.sendRedirect("/servlet/login");
        }
    }
}
