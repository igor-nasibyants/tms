package org.mycompany.date;

import javax.servlet.ServletException;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

import java.io.IOException;
import java.time.LocalDateTime;

@WebServlet("/date")
public class DataServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        resp.setContentType("text/html");
        LocalDateTime time = LocalDateTime.now();
        resp.getWriter().println(time);
    }
}
