<%@ page import="java.io.PrintWriter" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Registration</title>
    </head>
    <body>
        <div>
                    <%
                        PrintWriter printWriter = response.getWriter();
                        if (request.getAttribute("valid") != null) {
                            printWriter.println("<p>User '" + request.getAttribute("valid") + "' added!</p>");
                        }
                        if (request.getAttribute("notValid") != null) {
                            printWriter.println("password must contain a capital letter," +
                                                            " a number, be at least 6 characters long");
                        }
                    %>
                    <div>
                        <div>
                            <h2>Registration</h2>
                        </div>
                        <form action="testA" method="post">
                            <input name="inputLoginTest">
                            <input name="inputPasswordTest">
                            <button name="buttonSubTest">OK</button>
                        </form>
                    </div>
        </div>
        <div>
        <button onclick="location.href='/siteservlet'">Back to main</button>
        </div>
    </body>
</html>