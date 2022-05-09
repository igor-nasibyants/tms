package org.superpaulscompany.pavel.servlets.homework22;

import org.superpaulscompany.pavel.model.MyDate;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class MyDateServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html");

        PrintWriter printWriter = resp.getWriter();

        MyDate paris = new MyDate("Paris", LocalDateTime.now(ZoneId.of("Europe/Paris")));
        MyDate darwin = new MyDate("Darwin", LocalDateTime.now(ZoneId.of("Australia/Darwin")));
        MyDate jakarta = new MyDate("Jakarta", LocalDateTime.now(ZoneId.of("Asia/Jakarta")));
        MyDate indianapolis = new MyDate("Indianapolis", LocalDateTime.now(ZoneId.of("America/Indiana/Indianapolis")));
        MyDate cairo = new MyDate("Cairo", LocalDateTime.now(ZoneId.of("Africa/Cairo")));
        MyDate buenos_aires = new MyDate("Buenos Aires", LocalDateTime.now(ZoneId.of("America/Argentina/Buenos_Aires")));
        MyDate kolkata = new MyDate("Kolkata", LocalDateTime.now(ZoneId.of("Asia/Kolkata")));

        ArrayList<MyDate> localDateTimeArrayList = new ArrayList<>();
        Collections.addAll(localDateTimeArrayList, paris, darwin, jakarta, indianapolis, cairo, buenos_aires, kolkata);

        printWriter.println("<html>" + "<h1 style=\"text-align: center\">" + "Sorted by city name => " + "</h1>" + "</html>");

        localDateTimeArrayList.stream()
                .sorted(Comparator.comparing(MyDate::name))
                .forEach(x -> printWriter.println("<html>" + "<h1 style=\"color: darkred;text-align: center\">"
                        + x + "</h1>" + "</html>"));

        printWriter.println("<html>" + "<h1 style=\"text-align: center\">" + "Sorted by city time => " + "</h1>" + "</html>");

        localDateTimeArrayList.stream()
                .sorted(Comparator.comparing(MyDate::localDateTime))
                .forEach(x -> printWriter.println("<html>" + "<h1 style=\"color: crimson;text-align: center\">"
                        + x + "</h1>" + "</html>"));

        resp.setIntHeader("Refresh", 1);
    }
}
