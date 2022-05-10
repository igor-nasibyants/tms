package by.mycompany.ast.servlets.loginservlets;

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

@WebServlet("/settings")
public class SettingsServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("views/login/settings.jsp");
        HttpSession session = req.getSession();
        req.setAttribute("userForSettings", session.getAttribute("user"));
        req.setAttribute("name", ((User)session.getAttribute("user")).getName());
        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession(false);
        User user = (User) session.getAttribute("user");

        String name = req.getParameter("name");
        String login = req.getParameter("login");
        String password = req.getParameter("password");

        if(name != null){
            user.setName(name);
        }else if (login != null){
            user.setLogin(login);
        }else if(password != null){
            user.setPassword(password);
        }
        if (UserRepo.update(user)){
            session.setAttribute("user", UserRepo.selectOne(user.getLogin()));
            req.setAttribute("userUpdate", "User update");
            resp.sendRedirect("settings");
        }
    }
}
