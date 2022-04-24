package org.superpaulscompany.pavel;

import org.superpaulscompany.pavel.model.PartyMember;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

@WebServlet("/hello")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html");
        PrintWriter printWriter = resp.getWriter();

        String name = req.getParameter("userName");
        String surname = req.getParameter("userSurname");
        int age = Integer.parseInt(req.getParameter("userAge"));
        String gender = req.getParameter("gender");
        String country = req.getParameter("country");
        String[] provisions = req.getParameterValues("provisions");
        String[] comments = req.getParameterValues("comments");

        PartyMember partyMember = new PartyMember(name,surname,age,gender,country,provisions,comments);

        printWriter.println("<h1 style=\"color: black;text-align: center\">A member of our party and his provisions: </h1>");
        printWriter.println("<h1><p style=\"color: crimson;text-align: center\">Name: " + partyMember.name() + "</p></h1>");
        printWriter.println("<h1><p style=\"color: crimson;text-align: center\">Surname: " + partyMember.surname() + "</p></h1>");
        printWriter.println("<h1><p style=\"color: crimson;text-align: center\">Age: " + partyMember.age() + "</p></h1>");
        printWriter.println("<h1><p style=\"color: darkblue;text-align: center\">Gender: " + partyMember.gender() + "</p></h1>");
        printWriter.println("<h1><p style=\"color: darkgreen;text-align: center\">Country: " + partyMember.country() + "</p></h1>");
        printWriter.println("<h1 style=\"color: crimson;text-align: center\">Provisions =></h1>");
        Arrays.stream(provisions).forEach(x -> printWriter.println("<h2><li style=\"color: black;text-align: center\">" + x + "</li></h2>"));
        printWriter.println("<h1 style=\"color: crimson;text-align: center\">Comments =></h1>");
        Arrays.stream(comments).forEach(x -> printWriter.println("<h2><li style=\"color: black;text-align: center\">" + x + "</li></h2>"));
    }
}
