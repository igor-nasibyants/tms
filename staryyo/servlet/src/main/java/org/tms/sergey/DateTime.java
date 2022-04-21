package org.tms.sergey;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;


/**
 * This is simple servlet that demonstrates work with {@link java.util.Date} class.
 *
 * @author Eugene Suelimanov
 */
public class DateTime extends HttpServlet {
    public class DateTimeDemo extends HttpServlet {
        public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            response.setContentType("text/html");

            String docType = "<!DOCTYPE html>";
            String title = "Date and Time Demo";
            Date currentDate = new Date();

            PrintWriter writer = response.getWriter();

            writer.println(docType + "<html>" +
                    "<head>" +
                    "<title>" + title + "</title>" +
                    "</head>" +
                    "<body>" +
                    currentDate.toString() +
                    "</body>" +
                    "</html>");
        }

        public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            doGet(request, response);
        }
    }


}
