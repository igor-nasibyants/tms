package org.superpaulscompany.pavel;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet("/year")
public class DayNumberInTheYearServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html");
        PrintWriter printWriter = resp.getWriter();

        String date = req.getParameter("userDate");
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        Date numberInTheYear = null;
        try {
            numberInTheYear = format.parse(date);
        } catch (ParseException e) {
            printWriter.println("<h1 style=\"color: darkred;text-align: center\">"
                    + "You were asked to enter the date according to the pattern! Do it please!</h1>"
                    + "<h1 style=\"color: red;text-align: center\"> Exception: " + e + "</h1>");
        }

        printWriter.println("<h1 style=\"color: black;text-align: center\">Day number in the year according to the entered date: </h1>");
        printWriter.println("<h1><p style=\"color: crimson;text-align: center\">Number of the day in the year is "
                + "<u>" + new SimpleDateFormat("D").format(numberInTheYear).toUpperCase() + "</u></p></h1>");
    }
}
