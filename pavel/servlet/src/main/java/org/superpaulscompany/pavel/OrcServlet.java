package org.superpaulscompany.pavel;

import org.superpaulscompany.pavel.model.Orc;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class OrcServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html");

        PrintWriter printWriter = resp.getWriter();
        printWriter.println("<html>" + "<h1>" + "There will be a horde of orcs!!!" + "</h1>" + "</html>");

        HttpSession session = req.getSession();
        Orc orc = (Orc) session.getAttribute("orc");

        if (orc == null) {
            orc = new Orc("Thrall", 35);
            session.setAttribute("orc", orc);
            printWriter.println("<html>" + "<h1>" + "Session dara are set" + "</h1>" + "</html>");
        } else {
            printWriter.println("<html>" + "<h1>" + "Name: " + orc.name() + " Age: " + orc.age() + "</h1>" + "</html>");
            session.removeAttribute("orc");
        }
    }
}
