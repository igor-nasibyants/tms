package org.mycompany.date;

import javax.servlet.ServletException;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

import java.io.IOException;
import java.time.LocalDateTime;

@WebServlet("/date")
public class Data extends HttpServlet {
    LocalDateTime time = LocalDateTime.now();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        resp.getWriter().println(time);
    }
}
