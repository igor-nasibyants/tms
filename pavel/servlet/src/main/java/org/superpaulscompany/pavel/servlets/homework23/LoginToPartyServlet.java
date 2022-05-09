package org.superpaulscompany.pavel.servlets.homework23;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.superpaulscompany.pavel.model.PartyMember;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;

public class LoginToPartyServlet extends HttpServlet {
    private final ArrayList<PartyMember> partyMemberArrayList = new ArrayList<>();
    private final ObjectMapper objectMapper = new ObjectMapper();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        req.setCharacterEncoding("UTF8");
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter printWriter = resp.getWriter();

        String name = req.getParameter("userName");
        String surname = req.getParameter("userSurname");
        int age = Integer.parseInt(req.getParameter("userAge"));
        String email = req.getParameter("userEmail");
        String gender = req.getParameter("gender");
        String country = req.getParameter("country");
        String nationality = req.getParameter("nationality");
        String[] provisions = req.getParameterValues("provisions");
        String comments = req.getParameter("comments");

        PartyMember partyMember = new PartyMember(name, surname, age, email, gender, country, nationality, provisions, comments);
        partyMemberArrayList.add(partyMember);

        writeJson();

        printWriter.println("<h1 style=\"color: black;text-align: center\">A member of our party: </h1>");
        printWriter.println("<h1><p style=\"color: crimson;text-align: center\">Name: " + partyMember.name() + "</p></h1>");
        printWriter.println("<h1><p style=\"color: crimson;text-align: center\">Surname: " + partyMember.surname() + "</p></h1>");
        printWriter.println("<h1><p style=\"color: crimson;text-align: center\">Age: " + partyMember.age() + "</p></h1>");
        printWriter.println("<h1><p style=\"color: crimson;text-align: center\">Email: " + partyMember.email() + "</p></h1>");
        printWriter.println("<h1><p style=\"color: darkblue;text-align: center\">Gender: " + partyMember.gender() + "</p></h1>");
        printWriter.println("<h1><p style=\"color: darkgreen;text-align: center\">Country: " + partyMember.country() + "</p></h1>");
        printWriter.println("<h1><p style=\"color: darkgreen;text-align: center\">Nationality: " + partyMember.nationality() + "</p></h1>");
        printWriter.println("<h1 style=\"color: crimson;text-align: center\">Provisions =></h1>");
        Arrays.stream(provisions).forEach(x -> printWriter.println("<h2><li style=\"color: black;text-align: center\">" + x + "</li></h2>"));
        printWriter.println("<h1 style=\"color: crimson;text-align: center\">Comments =></h1>");
        printWriter.println("<h2><li style=\"color: black;text-align: center\">" + partyMember.comments() + "</li></h2>");
    }

    private void writeJson() throws JsonProcessingException {
        String toJson = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(partyMemberArrayList);
        partyMemberArrayList.forEach(x -> {
            try (FileOutputStream fileOutputStream = new FileOutputStream("PartyMember.json")) {
                fileOutputStream.write(toJson.getBytes(StandardCharsets.UTF_8));
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }
}
