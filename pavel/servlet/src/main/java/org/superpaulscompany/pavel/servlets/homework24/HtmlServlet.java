package org.superpaulscompany.pavel.servlets.homework24;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HtmlServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        req.setCharacterEncoding("UTF8");
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter printWriter = resp.getWriter();

        String name = req.getParameter("userName");
        String language = req.getParameter("language");
        String inf = req.getParameter("inf");
        String password = req.getParameter("secret");

        printWriter.println("<br><br><br><h1 style=\"color: crimson;text-align: center\">Name: </h1>");
        printWriter.println("<h2><li style=\"color: black;text-align: center\">" + name + "</li></h2>");
        printWriter.println("<h1 style=\"color: crimson;text-align: center\">Programming language: </h1>");
        printWriter.println("<h2><li style=\"color: black;text-align: center\">" + language + "</li></h2>");
        printWriter.println("<h1 style=\"color: crimson;text-align: center\">Additional information: </h1>");
        printWriter.println("<h2><li style=\"color: black;text-align: center\">" + inf + "</li></h2>");
        printWriter.println("<h1 style=\"color: crimson;text-align: center\">Secret word: </h1>");
        printWriter.println("<h2><li style=\"color: black;text-align: center\">" + password + "</li></h2>");
    }
}
