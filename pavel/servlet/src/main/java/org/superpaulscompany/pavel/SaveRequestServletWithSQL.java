package org.superpaulscompany.pavel;

import org.superpaulscompany.pavel.model.Application;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class SaveRequestServletWithSQL extends HttpServlet {
    private static final String URL = "jdbc:mysql://localhost/application";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "pagymubuj8991";

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF8");
        resp.setContentType("text/html;charset=UTF-8");
        HttpSession httpSession = req.getSession();

        String name = req.getParameter("userName");
        String nickName = req.getParameter("userNickName");
        String age = req.getParameter("userAge");
        String wish = req.getParameter("userWish");

        if (name.equals("")) {
            getServletContext().getRequestDispatcher("/save-request-withSQL.jsp").forward(req, resp);
        } else if (nickName.equals("")) {
            getServletContext().getRequestDispatcher("/save-request-withSQL.jsp").forward(req, resp);
        } else if (age.equals("")) {
            getServletContext().getRequestDispatcher("/save-request-withSQL.jsp").forward(req, resp);
        } else if (wish.equals("")) {
            getServletContext().getRequestDispatcher("/save-request-withSQL.jsp").forward(req, resp);
        } else {
            httpSession.setAttribute("userName", name);
            httpSession.setAttribute("userNickName", nickName);
            httpSession.setAttribute("userAge", age);
            httpSession.setAttribute("userWish", wish);
            Application application = new Application(name, nickName, age, wish);
            insertToMySQL(application);
            getServletContext().getRequestDispatcher("/savedToSQL.jsp").forward(req, resp);
        }
    }

    public static int insertToMySQL(Application application) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            try(Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
                String sql = "INSERT INTO application (userName, userNickName, userAge, userWish) Values(?, ?, ?, ?)";
                try(PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                    preparedStatement.setString(1, application.name());
                    preparedStatement.setString(2, application.nickName());
                    preparedStatement.setString(3, application.age());
                    preparedStatement.setString(4, application.wish());

                    return preparedStatement.executeUpdate();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
}
