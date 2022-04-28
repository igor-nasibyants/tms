package org.mycompany.myname;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/servlet")
public class HelloServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession();
        session.setAttribute("name", "Tom");
        session.setAttribute("age", 34);

        getServletContext().getRequestDispatcher("/basic.jsp").forward(request, response);
    }
}