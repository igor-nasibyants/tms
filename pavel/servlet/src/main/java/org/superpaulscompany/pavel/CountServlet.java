package org.superpaulscompany.pavel;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class CountServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html");
        PrintWriter printWriter = resp.getWriter();
        HttpSession session = req.getSession();
        Integer count = (Integer) session.getAttribute("count");

        if (count == null) {
            session.setAttribute("count", 1);
            count = 1;
        } else {
            session.setAttribute("count", ++count);
        }

        printWriter.println("<br><br>" + "<html>" + "<h1 style=\"color: darkmagenta;text-align: center\">"
                + "Number of page visits for session: " + "<br>" + count + "</h1>" + "</html>");
    }
}
