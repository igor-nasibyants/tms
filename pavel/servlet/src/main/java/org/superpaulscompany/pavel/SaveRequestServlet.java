package org.superpaulscompany.pavel;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SaveRequestServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        req.setCharacterEncoding("UTF8");
        resp.setContentType("text/html;charset=UTF-8");

        String name = req.getParameter("userName");
        String nickName = req.getParameter("userNickName");
        String age = req.getParameter("userAge");
        String wish = req.getParameter("userWish");

        if (name.equals("")) {
            getServletContext().getRequestDispatcher("/save-request.jsp").forward(req, resp);
        } else if (nickName.equals("")) {
            getServletContext().getRequestDispatcher("/save-request.jsp").forward(req, resp);
        } else if (age.equals("")) {
            getServletContext().getRequestDispatcher("/save-request.jsp").forward(req, resp);
        } else if (wish.equals("")) {
            getServletContext().getRequestDispatcher("/save-request.jsp").forward(req, resp);
        } else {
            getServletContext().getRequestDispatcher("/saved.jsp").forward(req, resp);
        }
    }
}
