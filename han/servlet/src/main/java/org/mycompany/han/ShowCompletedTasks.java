package org.mycompany.han;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static org.mycompany.han.UtilsFunction.*;

@WebServlet("/showCompleted")
public class ShowCompletedTasks extends HttpServlet {

    public void doGet(HttpServletRequest httpServletRequest,
                      HttpServletResponse httpServletResponse) throws ServletException, IOException {
        List<Task> tasks = getTasks().stream().filter(Task::isStatus).toList();
        httpServletRequest.setAttribute("tasks", tasks);
        getServletContext().getRequestDispatcher("/index.jsp").forward(httpServletRequest, httpServletResponse);
    }

    public static void main(String[] args) {
        List<Task> tasks = getTasks().stream().filter(Task::isStatus).toList();
        System.out.println(tasks);
    }
}
