package by.mycompany.ast.servlets;

import by.mycompany.ast.entity.User;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/reg")
public class RegPage extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String login = req.getParameter("regLogin");
        String password1 = req.getParameter("regPassword1");
//        String password2 = req.getParameter("regPassword2");
//        if(password1.equals(password2)){
            User newUser = new User(login, password1);
//            UserRepo.addUserToList(newUser);
            resp.getWriter().print(newUser);
//        }
    }
}