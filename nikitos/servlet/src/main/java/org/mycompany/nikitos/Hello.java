package org.mycompany.nikitos;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

@WebServlet("/serv")
public class Hello extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse)
            throws IOException {
        Scanner scanner = new Scanner(System.in);
        LocalDate localDate = LocalDate.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern( "dd-MM-yyyy  HH:mm:ss");

        String formatDateTime = localDateTime.format(dateTimeFormatter);
        httpServletResponse.getWriter().printf(formatDateTime);
    }
}
