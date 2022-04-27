package org.superpaulscompany.pavel;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DayOfTheWeekServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html");
        PrintWriter printWriter = resp.getWriter();

        String date = req.getParameter("userDate");
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        Date dayOfWeek;

        try {
            dayOfWeek = format.parse(date);
            printWriter.println("<h1 style=\"color: black;text-align: center\">Day of the week according to the entered date: </h1>");
            printWriter.println("<h1><p style=\"color: crimson;text-align: center\">Day of the week is "
                    + "<u>" + new SimpleDateFormat("EEEE").format(dayOfWeek).toUpperCase() + "</u></p></h1>");
        } catch (ParseException e) {
            printWriter.println("<h1 style=\"color: darkred;text-align: center\">"
                    + "You were asked to enter the date according to the pattern! Do it please!</h1>"
                    + "<h1 style=\"color: red;text-align: center\"> Exception: " + e + "</h1>");
        }
    }
}
