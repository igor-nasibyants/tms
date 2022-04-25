package org.mycompany.han;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.List;

import static org.mycompany.han.UtilsFunction.*;


@WebServlet("/showAll")
public class ShowAllTasks extends HttpServlet {
    public void doGet(HttpServletRequest httpServletRequest,
                      HttpServletResponse httpServletResponse) throws ServletException, IOException {
        List<Task> tasks = getTasks();
        httpServletRequest.setAttribute("tasks", tasks);
        getServletContext().getRequestDispatcher("/index.jsp").forward(httpServletRequest, httpServletResponse);
    }
}
