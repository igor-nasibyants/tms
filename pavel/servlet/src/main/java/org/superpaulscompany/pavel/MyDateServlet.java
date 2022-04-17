package org.superpaulscompany.pavel;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDateTime;

@WebServlet("/servlet")
public class MyDateServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.getWriter().println("Fool, you're lost in time.\n");
        LocalDateTime localDateTime = LocalDateTime.of(1999,12,31,23,59,59);
        resp.getWriter().println(localDateTime);
    }
}
