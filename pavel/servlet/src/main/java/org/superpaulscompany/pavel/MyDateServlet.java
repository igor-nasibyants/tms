package org.superpaulscompany.pavel;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;


public class MyDateServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html");

        PrintWriter printWriter = resp.getWriter();
        printWriter.println("Fool, you're lost in time.\n");

        LocalDateTime localDateTime = LocalDateTime.of(1999, 12, 31, 23, 59, 59);
        LocalDateTime localDateTime1 = LocalDateTime.of(1901, 11, 5, 3, 25, 48);
        LocalDateTime localDateTime2 = LocalDateTime.of(2050, 7, 30, 5, 54, 28);
        LocalDateTime localDateTime3 = LocalDateTime.now();

        ArrayList<LocalDateTime> localDateTimeArrayList = new ArrayList<>();
        Collections.addAll(localDateTimeArrayList, localDateTime, localDateTime1, localDateTime2, localDateTime3);

        localDateTimeArrayList
                .stream()
                .sorted()
                .forEach(x -> printWriter.println("<html>" + "<h1>" + x + "</h1>" + "</html>"));
    }
}
