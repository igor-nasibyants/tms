package org.mycompany.week;
import javax.servlet.ServletException;
import javax.servlet.annotation.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Scanner;
import java.util.regex.Pattern;

@WebServlet("/week")
public class WeekServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        Scanner sc = new Scanner(System.in);
        Calendar g = Calendar.getInstance();
        String format = "^(([0-3][0-9])(.)([0-1][0-2])(.)([1-2][09]\\d{2}))$";
        Pattern pattern = Pattern.compile(format);
        
    }
}
