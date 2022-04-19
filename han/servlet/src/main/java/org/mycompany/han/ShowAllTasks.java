package org.mycompany.han;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.File;
import java.io.IOException;

import static org.mycompany.han.UtilsFunction.*;


@WebServlet("/showAll")
public class ShowAllTasks extends HttpServlet {

    //Разобраться с путями
    String HTMLString;

    {
        try {
            HTMLString = String.valueOf(Jsoup.parse(new File("D:\\Java\\TMS\\tms\\han\\servlet\\src\\main\\webapp\\index.jsp"),
                    "ISO-8859-1"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    Document html = Jsoup.parseBodyFragment(HTMLString);
    Element element = html.getElementById("tasks");

    public void doGet(HttpServletRequest httpServletRequest,
                      HttpServletResponse httpServletResponse) {
        httpServletResponse.setContentType("text/html;charset=UTF-8");
        updateTodo(httpServletResponse, HTMLString, getTasks(), element);
    }
}
